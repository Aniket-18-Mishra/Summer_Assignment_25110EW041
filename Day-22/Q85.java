import java.util.Scanner;

public class Q85 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        String rev = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            rev += s.charAt(i);
        }

        if (s.equals(rev)) {
            System.out.println("Palindrome String");
        } else {
            System.out.println("Not a Palindrome String");
        }
        sc.close();
    }
}