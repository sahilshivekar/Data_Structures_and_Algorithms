package sortingAlgos;

public class selectionSort {

    /*
     * idea: pick the smallest, put it at the beginning.
     */
    public static void sort(int nums[]) {
        for (int i = 0; i < nums.length - 1; i++) {
            int key = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[key]) {
                    key = j;
                }
            }
            int temp = nums[key];
            nums[key] = nums[i];
            nums[i] = temp;
        }
    }

    public static void main(String[] args) {
        int nums[] = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        sort(nums);
        for (int num : nums) {
            System.out.println(num);
        }
    }
}
