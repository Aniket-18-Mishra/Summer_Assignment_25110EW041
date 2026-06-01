 import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        long fac = 1;

        for (int i = 1; i <= num; i++) {
            fac *= i;
        }

        System.out.println("Factorial of " + num + " = " + fac);
    }
} 
    

