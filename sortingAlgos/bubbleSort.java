package sortingAlgos;

public class bubbleSort {

    /*
     * idea: large elements come to the end of array by swapping with adjacent
     * element
     */
    public static void sort(int nums[]) {
        for (int turn = 0; turn < nums.length - 1; turn++) {
            int swap = 0;
            for (int j = 0; j < nums.length - 1 - turn; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    swap++;
                }
            }
            if (swap == 0)
                break;
        }
    }

    public static void main(String[] args) {
        int sorted[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        // int nums[] = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        sort(sorted);
        for (int num : sorted) {
            System.out.println(num);
        }
    }
}
