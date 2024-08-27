package recursion;

/*
 * Recursion is a method of solving a computational problem where the solution 
 * depends on solutions to smaller instances of the same problem.
 */

public class RecursionBasics {

    /*
     * time: O(n)
     * space: O(n)
     */
    public static int findLastOccurence(int[] nums, int val, int i, int l) {
        if (i == nums.length) {
            return l;
        }
        if (nums[i] == val) {
            l = i;
        }
        return findLastOccurence(nums, val, i + 1, l);
    }

    /*
     * time: O(n)
     * space: O(n)
     */
    public static int findFirstOccurence(int[] nums, int val, int i) {
        if (i == nums.length) {
            return -1;
        }
        if (nums[i] == val) {
            return i;
        }
        return findFirstOccurence(nums, val, i + 1);
    }

    /*
     * time:O(n)
     * space:O(n)
     */
    public static boolean isSorted(int[] nums, int i) {
        if (i == nums.length - 1) {
            return true;
        }
        if (nums[i] > nums[i + 1]) {
            return false;
        }
        return isSorted(nums, i + 1);
    }

    /*
     * time: O(2**n)
     * maximum height of calls is n.
     */
    public static int fibonacci(int n) {
        if (n == 1 || n == 0) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static int sumOfFirstNaturalNumbers(int n) {
        if (n == 1) {
            return n;
        }
        return n + sumOfFirstNaturalNumbers(n - 1);
    }

    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void printInIncreasingOrder(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        printInIncreasingOrder(n - 1);
        System.out.print(n + " ");
    }

    public static void printInDecreasingOrder(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        printInDecreasingOrder(n - 1);
    }

    public static void main(String[] args) {
        // System.out.println(sumOfFirstNaturalNumbers(5));
        // System.out.println(factorial(4));
        // printInDecreasingOrder(10);
        // printInIncreasingOrder(10);
        // System.out.println(fibonacci(5));
        int[] nums = { 1, 2, 3, 48, 5, 6, 48 };
        // System.out.println(isSorted(nums, 0));
        // System.out.println(findFirstOccurence(nums, 48, 1)); //4
        // System.out.println(findLastOccurence(nums, 48, 0, -1));
    }
}
