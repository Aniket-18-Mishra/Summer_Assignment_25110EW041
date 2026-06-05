import java.util.Scanner;

public class PrimeFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int largest = 1;

        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                boolean prime = true;

                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        prime = false;
                        break;
                    }
                }

                if (prime) {
                    largest = i;
                }
            }
        }

        System.out.println("Largest Prime Factor = " + largest);
        sc.close();
    }
    
}