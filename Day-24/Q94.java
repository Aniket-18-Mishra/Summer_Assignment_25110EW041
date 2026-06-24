import java.util.Scanner;

public class Q94 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        String result = "";
        int count = 1;

        for (int i = 0; i < s.length(); i++) {

            if (i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
                count++;
            } else {
                result += s.charAt(i);
                result += count;
                count = 1;
            }
        }

        System.out.println("Compressed String: " + result);
        sc.close();
    }
}