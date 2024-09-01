import java.util.Scanner;
public class DSA4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.print("first number (a): ");
        int a = scanner.nextInt();

        System.out.print(" second number (b): ");
        int b = scanner.nextInt();

        System.out.print(" third number (c): ");
        int c = scanner.nextInt();

        int greatest;
        if (a >= b && a >= c) {
            greatest = a;
        } else if (b >= a && b >= c) {
            greatest = b;
        } else {
            greatest = c;
        }
        System.out.println("The greatest number among a, b, and c is: " + greatest);
    }
}
