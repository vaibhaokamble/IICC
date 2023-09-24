/* 34) Write a program in Java to display and print the sum of following series
S= 1 + (x+2)/2! + (2x+3)/3! + (3x+4)/4! +…..+nth ter */

package assignment;

import java.util.Scanner;
public class que34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = input.nextInt();
        System.out.print("Enter the value of x: ");
        int x = input.nextInt();
        double sum = 1.0;
        double term = 0.0;
        for (int i = 1; i <= n; i++) {
            term = (i * x) + (i + 1);
            sum += term / factorial(i + 1);
        }
        System.out.println("Sum of the series is: " + sum);
    }

    public static double factorial(int n) {
        double fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}