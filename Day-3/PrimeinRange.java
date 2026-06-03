import java.util.Scanner;

public class PrimeinRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting number: ");
        int a = sc.nextInt();

        System.out.print("Enter ending number: ");
        int b = sc.nextInt();

        for (int n = a; n <= b; n++) {
            if (n <= 1) {
                continue;
            }

            boolean prime = true;

            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    prime = false;
                    break;
                }
            }

            if (prime) {
                System.out.print(n + " ");
            }
        }
        sc.close();
    }
}
