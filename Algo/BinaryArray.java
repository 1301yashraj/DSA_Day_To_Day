package Algo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class BinaryArray {
    public static void main(String[] args) {
        byte[] num1 = new byte[] { 1, 0, 0, 1, 0 };
        byte[] num2 = new byte[] { 1, 0, 1, 1, 1 };
        // 1 0 1 0 1 0
        sum(num1, num2);
    }

    public static void sum(byte[] num1, byte[] num2) {
        int ansLength = num1.length > num2.length ? num1.length : num2.length;
        int carry = 0;
        List<Integer> ans = new ArrayList<>();
        for (int i = ansLength - 1; i >= 0; i--) {
            ans.add((num1[i] + num2[i] + carry) % 2);
            carry = (num1[i] + num2[i] + carry) / 2;
        }
        Collections.reverse(ans);
        String result = ans.stream()
                .map(Object::toString)
                .collect(Collectors.joining());

        System.out.println("Ans >> " + carry + result);
    }
}