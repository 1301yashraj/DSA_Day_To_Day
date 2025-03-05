package Recurrsion.basics;

public class Name5times {
    public static void main(String[] args) {
        var name = "yash";
        int times = 5;
        printN(name, times);
    }

    private static void printN(String name, int times) {
        if (times == 0)
            return;
        System.out.println(times + ". " + name);
        printN(name, --times); // times-- will alwys pass the current value
    }
}