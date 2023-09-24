/*  develop a program in Java to create a class Fact and find the factorial of any number using recursion. */

import java.util.*;

public class Java09 {
    public static void main(String[] args) {
        Scanner v = new Scanner(System.in);
       
        System.out.println("Enter the number: ");
        int number = v.nextInt();
        int fact=1;
        for(int i=1;i<=number;i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial of the number = "+fact); 
    }
}
