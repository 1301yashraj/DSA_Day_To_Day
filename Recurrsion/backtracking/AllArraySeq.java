package Recurrsion.backtracking;

import java.util.ArrayList;
import java.util.List;

public class AllArraySeq {
    public static void main(String[] args) {
        int[] ar = { 1, 2, 3 };
        List<Integer> list = new ArrayList<>();
        getAllSeq(ar, 0, list);
    }

    private static void getAllSeq(int[] ar, int currentIndex, List<Integer> ans) {
        if (currentIndex == ar.length) {
            System.out.println(ans);
            return;
        }

        // including current element
        ans.add(ar[currentIndex]);
        getAllSeq(ar, currentIndex + 1, ans);

        // exclude current element
        ans.remove(ans.size() - 1);
        getAllSeq(ar, currentIndex + 1, ans);

    }
}
