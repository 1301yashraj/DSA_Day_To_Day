package Recurrsion.basics;

public class GCD {
    /*
     * 1.
     * Basic Approac is to use a loop from smaller number and find the number where
     * both leaves reminder = 0
     * thats your GCD
     *
     * 2.
     * Other apporach
     * GCD of (a,b) where a > b
     * any 2 numbers can be represented as a = b.q + r
     * lets assume g is the gcd of a and b so a/g and b/g both are fully divisible
     * => r = a-bq => a-bq is divisible by g => r is disvisble by g
     * Which simply means a number which divides a and b will also divide r as r is
     * a linear combination of a and b. since q is an integer.
     * so gcd(a,b) = gcd(b,r)
     */

    public static void main(String[] args) {
        System.out.println("G.C.D of 48 and 18 is " + gcd(48, 18));
    }

    private static int gcd(int b, int r) {
        if (r == 0)
            return b;
        return gcd(r, b % r);
    }

}
