/*
 * this problem is not from leetcode
 */
package recursion;

/*
 * problem statement: For a given integer array of size N. You have to find all the occurrences
(indices) of a given element (Key) and print them. Use a recursive function to solve this
problem.

 */
public class findAllOccurences {
    public static void sol(int[] arr, int i, int val){
        if(i == arr.length){
            return;
        }
        if(arr[i] == val){
            System.out.print(i + " ");
        }
        sol(arr, ++i, val);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,3,2,4,4,2,4}; //1 5 8
        sol(arr, 0, 2);
    }
}
