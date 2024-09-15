/*
 * leetcode 33. Search in Rotated Sorted Array
 */
package arrays;

public class SearchInRotatedSortedArray{
    public static int max(int[] arr, int n) {
        int max = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }

    public static int binarySearch(int[] arr, int left, int right, int target) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if(arr[mid] == target){
                return mid;
            } else if(arr[mid] < target){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static int search(int[] arr, int target) {
        int max = max(arr, arr.length);
        int targetIdx = binarySearch(arr, 0, max, target);
        if(targetIdx == -1){
            targetIdx = binarySearch(arr, max + 1, arr.length - 1, target);
        }
        return targetIdx;
    }
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(search(arr, 0));
    }
}