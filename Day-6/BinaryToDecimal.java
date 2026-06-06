import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        int n = sc.nextInt();

        int dec = 0;
        int p = 0;

        while (n > 0) {
            int d = n % 10;
            dec += d * Math.pow(2, p);
            p++;
            n /= 10;
        }

        System.out.println("Decimal number = " + dec);
        sc.close();
    }
}