import java.util.Scanner;

public class Q88 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        String result = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                result += s.charAt(i);
            }
        }

        System.out.println("String after removing spaces: " + result);
        sc.close();
    }
}