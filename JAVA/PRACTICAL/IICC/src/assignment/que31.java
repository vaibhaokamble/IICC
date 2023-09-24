/* 31) Write a program in Java to display and print the sum of following series
S=x - x2/3 + x3/5 - x4/7 + …. to n terms */

package assignment;
import java.util.Scanner;
public class que31 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the value of x: ");
        double x = s.nextDouble();

        System.out.print("Enter the number of terms: ");
        int n = s.nextInt();

        double sum = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                sum += Math.pow(x, i) / (2 * i - 1);
            } else {
                sum -= Math.pow(x, i) / (2 * i - 1);
            }
        }

        System.out.println("Sum of the series is: " + sum);
    }
}