import java.util.Scanner;

public class pow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base (x): ");
        int x = sc.nextInt();

        System.out.print("Enter power (n): ");
        int n = sc.nextInt();

        int ans = 1;

        for (int i = 1; i <= n; i++) {
            ans *= x;
        }

        System.out.println("Answer = " + ans);
        sc.close();
    }
}