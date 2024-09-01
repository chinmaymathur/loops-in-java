//print numbers from 1 to n,takes n as input 
import java.util.Scanner;

public class DSA5  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
        
        scanner.close();
    }
}
