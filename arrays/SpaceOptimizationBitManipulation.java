/*
 * geeks for geeks - Space optimization using bit manipulations
 * 
 * There are many situations where we use integer values as index in array to see presence or absence, 
 * we can use bit manipulations to optimize space in such problems.
 * 
 * Let us consider below problem as an example.
 * Given two numbers say a and b, mark the multiples of 2 and 5 between a and b using less than O(|b – a|) 
 * space and output each of the multiples. 
 */

package arrays;

public class SpaceOptimizationBitManipulation {
    public static void sol1(int a, int b) {

        if (a > b) {
            a = a + b;
            b = a - b;
            a = a - b;
        }

        int size = b - a + 1;
        int[] arr = new int[size];

        for (int i = a; i <= b; i++) {
            if (i % 2 == 0 || i % 5 == 0) {
                arr[i - a] = 1;
            }
        }
        System.out.println("MULTIPLES of a and 5:");

        for (int i = a; i <= b; i++) {
            if (arr[i - a] == 1) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean checkBit(int[] arr, int index) {
        int val = arr[index >> 5] & 1 << (index & 31);
        if (val == 0) {
            return false;
        }
        return true;
    }

    public static void setBit(int[] arr, int index) {
        arr[index >> 5] = arr[index >> 5] | 1 << (index & 31);
    }

    public static void sol(int a, int b) {
        if (a > b) {
            a = a + b;
            b = a - b;
            a = a - b;
        }

        int size = b - a;

        size = (int) Math.ceil((double) size / 32);

        int[] arr = new int[size];

        for (int i = a; i <= b; i++) {
            if (i % 2 == 0 || i % 5 == 0) {
                setBit(arr, i - a);
            }
        }

        for (int i = a; i <= b; i++) {
            if (checkBit(arr, i - a)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        // sol1(2,10);
        // System.out.println((int)Math.ceil((double)10/32));
        // sol(2, 10);
    }
}
