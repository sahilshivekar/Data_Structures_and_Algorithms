/*
 * leetcode: 88. Merge Sorted Array
 */
package arrays;

public class mergeSortedArrays {
    /*
     * We will traverse reverse in both arrays from there last element position.
     * We will compare them and add the bigger one at the last idx of nums1 as 
     * nums1 length is m + n.
     * 
     * time: O(n)
     * space: O(1)
     */
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1; //point to last number in current elements of nums1
        int j = n - 1; //point to last number in nums2
        int k = m + n - 1; //point to last idx in nums1

        while(j >= 0){
            if(i >= 0 && nums1[i] > nums2[j]){
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
    }
    public static void main(String[] args) {
        
    }
}
