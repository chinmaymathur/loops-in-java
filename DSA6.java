//print * pattern
public class DSA6 {
    public static void main(String[] args) {
        int n = 10; // Number of rows

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

 /* inverted triangle 
import java.util.Scanner;
public class DSA7{
    public static void main(String[]args){
        int n=5;//no. of rows
        for(int i=n;i>=1;i--){
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
*/