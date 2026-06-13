import java.util.Scanner;

public class Q45 {

    static boolean isPalindrome(int n) {
        int temp = n;
        int rev = 0;

        while (n != 0) {
            int d = n % 10;
            rev = rev * 10 + d;
            n = n / 10;
        }

        return temp == rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (isPalindrome(n)) {
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not a Palindrome Number");
        }
        sc.close();
    }
}