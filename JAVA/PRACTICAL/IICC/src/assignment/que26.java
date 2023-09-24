/* 26) Write a program in Java to print and solve the following series using for
loop
 S=1/1! + ½! +1/3!+……..+1/n! */

package assignment;

import java.util.Scanner;
public class que26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer n: ");
        int n = sc.nextInt();
        double sum = 0;
        System.out.print("The series is: ");
        for (int i = 1; i <= n; i++) {
            double factorial = 1;
            for (int j = 1; j <= i; j++) {
                factorial *= j;
            }
            sum += 1.0 / factorial;
            System.out.print("1/" + i + "! + ");
        }
        System.out.println("\b\b ");
        System.out.println("The sum of the series is: " + sum);
    }
}