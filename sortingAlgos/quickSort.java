package sortingAlgos;

public class quickSort {
    public static void qS(int nums[], int si, int ei) {
        if (si < ei) {
            int pIdx = partition(nums, si, ei);
            qS(nums, si, pIdx - 1);
            qS(nums, pIdx + 1, ei);
        }
    }

    public static int partition(int nums[], int si, int pIdx) {
        int i = si - 1;
        for (int j = si; j < pIdx; j++) {
            if (nums[j] < nums[pIdx]) {
                int temp = nums[++i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        int temp = nums[++i];
        nums[i] = nums[pIdx];
        nums[pIdx] = temp;
        return i;
    }

    public static void main(String[] args) {
        int[] arr = { 6, 4, 3, 4, 6, 2, 2, 3, 3, 2, 7, 8, 2, 7, 3, 4, 8, 2, 8, 3, 4 };
        qS(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
