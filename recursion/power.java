package recursion;

public class power {
    public static int powerSol1(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * powerSol1(x, n - 1);
    }

    public static int powerSol2(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int halfPower = powerSol2(x, n / 2);
        int halfPowerSq = halfPower * halfPower;
        if (n % 2 != 0) {
            halfPowerSq *= x;
        }
        return halfPowerSq;
    }

    public static void main(String[] args) {
        // System.out.println(powerSol1(2, 4));
        System.out.println(powerSol2(2, 7));
    }
}
