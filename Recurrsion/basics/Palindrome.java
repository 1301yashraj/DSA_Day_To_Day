package Recurrsion.basics;

public class Palindrome {
    public static void main(String[] args) {

        System.out.println("RACECAR : " + isPalindrome("RACECAR", 0));
        System.out.println("RACCAR : " + isPalindrome("RACCAR", 0));
        System.out.println("RACECARXX : " + isPalindrome("RACECARXX", 0));
    }

    private static boolean isPalindrome(String str, int currentIndex) {
        if (currentIndex > ((str.length() - 1) / 2))
            return true;
        if ((str.charAt(currentIndex)) == (str.charAt(str.length() - 1 - currentIndex)))
            return isPalindrome(str, currentIndex + 1);
        else
            return false;
    }
}
