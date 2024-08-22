package bitManipulation;

public class swapWithoutThirdValue {
    public static void main(String[] args) {
        int a = 1;
        int b = 9;
        System.out.println("before a: " + a);
        System.out.println("before b: " + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("after a: " + a);
        System.out.println("after b: " + b);
    }
}
