/*
* leetcode: 27. Remove Element
*/

package arrays;

public class removeElement {
    /*
     * We use a slow pointer and fast pointer if the fast pointer is pointing towards
     * a number which is equal to value then we make it zero and swap it with the idx
     * pointed by the slow pointer.
     * 
     * time: O(n)
     * space: O(1)
     */
    public static int solution(int[] nums, int val) {
        int idx = 0;
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[idx++] = nums[i];
                count++;
            } else{
                nums[i] = 0;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        
    }
}
