import java.util.Scanner;

public class Q104 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score = 0;
        int ans;

        System.out.println("----- Simple Quiz -----");

        System.out.println("\n1. Which language is used for Android development?");
        System.out.println("1. Java");
        System.out.println("2. Python");
        System.out.println("3. C");
        System.out.println("4. HTML");
        System.out.print("Enter your answer: ");
        ans = sc.nextInt();

        if (ans == 1) {
            score++;
        }

        System.out.println("\n2. How many days are there in a week?");
        System.out.println("1. 5");
        System.out.println("2. 6");
        System.out.println("3. 7");
        System.out.println("4. 8");
        System.out.print("Enter your answer: ");
        ans = sc.nextInt();

        if (ans == 3) {
            score++;
        }

        System.out.println("\n3. Which planet is known as the Red Planet?");
        System.out.println("1. Earth");
        System.out.println("2. Mars");
        System.out.println("3. Venus");
        System.out.println("4. Jupiter");
        System.out.print("Enter your answer: ");
        ans = sc.nextInt();

        if (ans == 2) {
            score++;
        }

        System.out.println("\n4. What is 10 + 20?");
        System.out.println("1. 10");
        System.out.println("2. 20");
        System.out.println("3. 30");
        System.out.println("4. 40");
        System.out.print("Enter your answer: ");
        ans = sc.nextInt();

        if (ans == 3) {
            score++;
        }

        System.out.println("\n5. Which keyword is used to create an object in Java?");
        System.out.println("1. class");
        System.out.println("2. public");
        System.out.println("3. new");
        System.out.println("4. static");
        System.out.print("Enter your answer: ");
        ans = sc.nextInt();

        if (ans == 3) {
            score++;
        }

        System.out.println("\nYour Score = " + score + "/5");
        sc.close();
    }
}
