package sortingAlgos;

public class countingSort {
    /*
     * time: O(n logn) sometimes near O(n)
     * space: O(n)
     * 
     * idea: count the frequencey of each number in the array and store it in
     * another array on the same index == number. this sorting techinque is used
     * when the range of numbers in the arrays is small like 0-100.
     */

    public static void sort(int arr[]) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }

        int count[] = new int[max + 1];

        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j++] = i;
                count[i]--;
            }
        }

    }

    public static void main(String[] args) {
        int arr[] = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        sort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}