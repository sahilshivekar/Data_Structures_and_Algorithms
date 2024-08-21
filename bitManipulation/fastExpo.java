package bitManipulation;

public class fastExpo {
    /*
     * this will calculate exponential of the number in O(log (n + 1)) complexity
     * bcz binary representation of each number is in (log(n + 1)) digits
     * 
     * this can be useful for competetive programing
     */
    public static int expo(int a, int n) {
        int ans = 1;
        while (n > 0) {
            if ((n & 1) != 0) ans *= a;
            a = a * a;
            n = n>>1;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(expo(2,8));
    }
}
