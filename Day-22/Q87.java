import java.util.Scanner;

public class Q87 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        System.out.print("Enter character to find: ");
        char ch = sc.next().charAt(0);

        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch) {
                count++;
            }
        }

        System.out.println("Frequency of " + ch + " = " + count);
        sc.close();
    }
}
