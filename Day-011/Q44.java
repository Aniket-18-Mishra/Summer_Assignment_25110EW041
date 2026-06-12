import java.util.Scanner;

public class Q44 {

    static long fact(int n) {
        long f = 1;

        for (int i = 1; i <= n; i++) {
            f *= i;
        }

        return f;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Factorial = " + fact(n));
        sc.close();
    }
}