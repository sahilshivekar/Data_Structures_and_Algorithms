package bitManipulation;

public class checkIfPowerIsTwo {

    /*
     * this solution work bcz each number in binary which is 
     * power of two has 1 only once which is at first position and the 
     * rest are 0s. but the previous number have exactly opposite.
     * 
     * ex.
     * 8 -> 1000
     * 7 -> 0111
     * 8 is power of two and & operation on this two will be 0
     */
    public static boolean checkIfPowerOfTwo(int n){
        return ((n&(n - 1)) == 0);
            
    }
    public static void main(String[] args) {
        int a = 8;    
        System.out.println(checkIfPowerOfTwo(a));
    }
}
