package bitManipulation;

public class binaryOperators {
    public static void main(String[] args) {

        /*
         * & AND
         * in AND operation output is 1 if and only if both values are 1.
         * 101 -> 5
         * 110 -> 6
         * 100 -> after doing AND operation
         */
        System.out.println(5 & 6);

        /*
         * | OR
         * in OR operation output is 0 if and only if both values are 0.
         * 101 -> 5
         * 110 -> 6
         * 111 -> after doing OR operation
         */
        System.out.println(5 | 6);

        /*
         * ^ XOR
         * in XOR operation output is 1 if and only if both values are different.
         * 101 -> 5
         * 110 -> 6
         * 011 -> after doing XOR operation
         */
        System.out.println(5 ^ 6);

        /*
         * ~ One's complement
         * in One's complement if input is 0 ouput is 1 and if input is 1 output is 0.
         * 101 -> 5
         * 010 -> after doing One's complement operation
         * out put will be -6 bcz the number 5 is not stored like 101
         * its stored like 00000101 in memory so when we do ~ operation it becomes
         * 11111010.
         * the most significant (bit on the most left side) tells the computer if
         * the number is negative or positive if its 1 then number is negative and
         * if its 0 then number is positive.
         * 
         * (to get 2's complement we just add 1 in the value after taking its 1's
         * complement)
         */
        System.out.println(~5);

        /*
         * << left Shift
         * It moves the bits on the left by given input and fills the empty bits on the
         * right side with 0.
         * 00000101 -> 5
         * 00010100 -> after doing left shift by 2 (this value is 20)
         * 
         * there is a formula to get the output value early it will help in competative
         * programing
         * formula is: a * 2**b
         * means for our example it will be 5 * 2**2 = 20.
         */
        System.out.println(5 << 2);

        /*
         * >> right Shift
         * It moves the bits on the right by given input and fills the empty bits on the
         * left side with 0.
         * 00000101 -> 5
         * 00000001 -> after doing right shift by 2 (this value is 1)
         * 
         * there is a formula to get the output value early it will help in competative
         * programing
         * formula is: a / 2**b
         * means for our example it will be 5 / 2**2 = 1.
         */
        System.out.println(5 >> 2);
    }
}
