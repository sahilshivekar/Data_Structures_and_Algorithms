package maths;

public class findGCDandLCM {
    public static Long[] lcmAndGcd(Long a, Long b) {
        Long[] ans = new Long[2];
        long n1 = a;
        long n2 = b;

        // gcd by euclidian algo
        while (a > 0 && b > 0) {
            if (a > b)
                a %= b;
            else
                b %= a;
        }
        ans[1] = a == 0 ? b : a;

        // lcm formula
        ans[0] = (n1 * n2) / ans[1];
        return ans;
    }
}
