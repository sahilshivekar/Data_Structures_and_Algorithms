/*
 * problem not from leetcode
 */
package recursion;

public class calLengthOfString {

    /*
     * my solution
     */
    public static void sol1(String s, int i) {
        try {
            s.charAt(i);
            sol1(s, i + 1);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(i);
        }
    }
    
    /*
     * apna college solution
     */
    public static int sol2(String s){
        if(s.length() == 1){
            return 1;
        }
        return sol2(s.substring(1)) + 1;
    }

    public static void main(String[] args) {
        String s = "Sahilrjdjd";
        sol1(s, 0);
        System.out.println(sol2(s));
    }
}
