package sortingAlgos;

class insertionSort {
    /*
     * idea: pick an element (from unsorted part) and place int the right position
     * in sorted part.
     * inspiration is taken from the cards.
     * 
     * time: O(n**2)
     * space: O(1)
     */
    public static void sort(int nums[]) {
        for (int i = 1; i < nums.length; i++) {
            int cur = nums[i];
            int prev = i - 1;

            // finding out the correct position to insert
            while (prev >= 0 && nums[prev] > cur) {
                nums[prev + 1] = nums[prev];
                prev--;
            }
            // inserting
            nums[prev + 1] = cur;
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