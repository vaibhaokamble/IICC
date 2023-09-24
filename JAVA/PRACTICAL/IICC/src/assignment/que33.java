/* 33) Write a program in Java to display and print the sum of following series
S= 1+2+4+7+11+…..+nth term */

package assignment;

import java.util.Scanner;
public class que33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = input.nextInt();
        int sum = 0;
        int num = 1;
        for (int i = 1; i <= n; i++) {
            sum += num;
            num += i;
        }
        System.out.println("Sum of the series is: " + sum);
    }
}
