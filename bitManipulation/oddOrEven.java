package bitManipulation;

public class oddOrEven {
    public static void check(int a) {
        /*
         * if the addtion output is 0 then its even bcz we are adding one
         * so after the last bit all other bits are 0.
         */
        int bitMask = 1;
        if ((a & bitMask) == 0) {
            System.out.println("EVEN");
        } else {
            System.out.println("ODD");
        }
    }

    public static void main(String[] args) {
        check(88);
        check(345);
        check(88456);
    }
}
