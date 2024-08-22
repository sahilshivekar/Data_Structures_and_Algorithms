package bitManipulation;

public class uppercaseToLowercase {
    public static void main(String[] args) {
        for (int ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print((char) (ch | ' '));
            System.out.print((char) (ch + ' '));
            System.out.print((char) (ch + 32));
        }
    }
}
