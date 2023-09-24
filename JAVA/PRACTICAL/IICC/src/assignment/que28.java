/* 28) Write a program in Java to print the multiplication table of 5 using for loop */

package assignment;
public class que28 {
    public static void main(String[] args) {
        int number = 5;
        System.out.println("Multiplication table of " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}