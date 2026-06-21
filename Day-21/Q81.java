import java.util.Scanner;

public class Q81 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        char[] ch = s.toCharArray();

        int count = 0;

        for (char c : ch) {
            count++;
        }
        System.out.println("Length of string = " + count);
        sc.close();
    }
}