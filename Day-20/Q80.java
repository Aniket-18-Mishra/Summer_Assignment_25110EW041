import java.util.Scanner;

public class Q80 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int r = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int c = sc.nextInt();

        int[][] a = new int[r][c];

        System.out.println("Enter matrix elements:");

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Column-wise Sum:");

        for (int j = 0; j < c; j++) {
            int sum = 0;

            for (int i = 0; i < r; i++) {
                sum += a[i][j];
            }

            System.out.println("Column " + (j + 1) + " Sum = " + sum);
        }
        sc.close();
    }
}