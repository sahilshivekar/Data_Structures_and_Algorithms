package sortingAlgos;

public class mergeSort {

    /*
     * time: O(n logn)
     * space: O(n)
     */
    public static void mS(int[] arr, int si, int ei) {
        if (si < ei) {
            int mid = si + (ei - si) / 2;
            mS(arr, si, mid);
            mS(arr, mid + 1, ei);
            merge(arr, si, mid, ei);
        }
    }

    public static void merge(int[] arr, int si, int mid, int ei) {
        int n = ei - si + 1;
        int[] temp = new int[n];
        int i = si;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i++];
            } else {
                temp[k] = arr[j++];
            }
            k++;
        }
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= ei) {
            temp[k++] = arr[j++];
        }
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        int[] arr = { 6, 4, 3, 4, 6, 2, 2, 3, 6, 3, 6, 3, 7, 6, 4 };
        mS(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}