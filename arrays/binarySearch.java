package arrays;

public class binarySearch {
    /*
     * works only on sorted array
     * 
     * time: O(logn)
     * because its dividing the array in each step
     * 
     * space: O(1)
     * because it does not require additional space proportional to the input size.
     * it only uses a few extra variables(for indices and midpoint) regardless of
     * the size of the input array
     */
    public static int binarySearchIterative(int a[], int key) {
        assert (a.length > 0);
        int start = 0, end = a.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (key > a[mid]) {
                start = mid + 1;
            } else if (key < a[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    /*
     * works only on sorted array
     * 
     * time: O(logn)
     * because its dividing the array in each step
     * 
     * space: O(logn)
     * each recursive call adds a new frame of layer to the stack. The maximum depth
     * of recursion is proportional to the logarithm of n.
     */
    public static int binarySearchRecursive(int a[], int start, int end, int key) {
        if (start <= end) {
            int mid = start + (end - start) / 2;
            if (key == a[mid]) {  
                return mid;
            } else if (key < a[mid]) {
                return binarySearchRecursive(a, start, mid - 1, key);
            }
            return binarySearchRecursive(a, mid + 1, end, key);
        }
        return -1;
    }

    public static void main(String[] args) {
        int a[] = { 2, 4, 6, 8, 10 };
        System.out.println(binarySearchIterative(a, 8));
        System.out.println(binarySearchRecursive(a, 0, a.length - 1, 8));
    }
}
