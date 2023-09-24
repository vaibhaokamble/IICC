/* 30) Write a program in Java to display and print the sum of following series
S=1-1+1-1+1-1+………… */

package assignment;
public class que30 {
    public static void main(String[] args) {
        int terms = 10;
        int sum = 0;

        for (int i = 1; i <= terms; i++) {
            if (i % 2 == 0) {
                sum -= 1;
            } else {
                sum += 1;
            }
        }

        System.out.println("Sum of the series is: " + sum);
    }
}