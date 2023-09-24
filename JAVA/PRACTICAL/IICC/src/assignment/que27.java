/* 27) Write a program in Java to print and solve the following series using
while loop
 S=1 +1/0.1+1/0.01+……..+nth term */

package assignment;

import java.util.Scanner;
public class que27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer n: ");
        int n = sc.nextInt();
        double sum = 0;
        double term = 1.0;
        int i = 0;
        System.out.print("The series is: ");
        while (i < n) {
            sum += term;
            System.out.print(term + " + ");
            term /= 10;
            i++;
        }
        System.out.println("\b\b ");
        System.out.println("The sum of the series is: " + sum);
    }
}