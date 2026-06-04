import java.util.Scanner;

public class ArmstrongRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting number: ");
        int a = sc.nextInt();

        System.out.print("Enter ending number: ");
        int b = sc.nextInt();

        for (int n = a; n <= b; n++) {
            int temp = n;
            int sum = 0;

            while (temp != 0) {
                int d = temp % 10;
                sum = sum + (d * d * d);
                temp = temp / 10;
            }

            if (sum == n) {
                System.out.print(n + " ");
            }
        }
        sc.close();
    }
}