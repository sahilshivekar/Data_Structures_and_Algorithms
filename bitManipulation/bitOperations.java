package bitManipulation;

public class bitOperations {

    /*
     * get ith bit
     * we left shift 1 i times and then do AND operation to check the bit
     * Let's say n = 5 (binary 00000101), and i = 2.
     * The bitMask for i = 2 would be 00000100.
     * Performing n & bitMask gives 00000101 & 00000100 = 00000100.
     * Since the result is non-zero, the i-th bit in n is 1, so the function returns
     * 1.
     */
    public static int getIthBit(int n, int i) {
        int bitMask = 1 << i;
        if ((n & bitMask) == 0) {
            return 0;
        }
        return 1;
    }

    /*
     * set ith bit
     * we left shift 1 i times and then do OR operation to set the bit
     */
    public static int setIthBit(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;
    }

    /*
     * clear ith bit
     * we do AND operation on the only bit we want to clear
     */
    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    /*
     * update ith bit
     */
    public static int updateIthBit(int n, int i, int newBit) {
        // if(newBit == 0){
        // return setIthBit(n, i);
        // } else{
        // return clearIthBit(n, i);
        // }

        // another approach
        n = clearIthBit(n, i);
        int bitMask = newBit << i;
        return n | bitMask;
    }

    /*
     * clear last i bits
     */
    public static int clearLastIBits(int n, int i) {
        int bitMask = (~(0) << i);
        return n & bitMask;
    }

    /*
     * clear range of bits
     * 
     * imp: 1<<i means 2**i in decimal
     * eg. 1<<2 = 100 and if we do 1 << 2 - 1 then it will be 11
     * bcz 100 in decimal is 4 and 4 - 1 = 3 and binary of 3 is 11
     */
    public static int clearRangeOfBits(int n, int i, int j) {
        int left = (~(0) << j + 1);
        int right = (1 << i) - 1;
        int bitMask = left | right;
        return n & bitMask;
    }

    public static void main(String[] args) {
        // System.out.println(getIthBit(10, 2)); // 0
        // System.out.println(setIthBit(10, 2));
        // System.out.println(clearIthBit(10, 1));
        // System.out.println(updateIthBit(10, 2, 1));
        // System.out.println(clearLastIBits(15, 2));
        // System.out.println(clearRangeOfBits(10, 2,4)); //2

    }
}