/*  develop a program in Java to demonstrate the while statement. */

import java.util.*;

public class Java04 {
    public static void main(String[] args) {
        Scanner v =new Scanner(System.in);
        System.out.println("Enter the any value");
        int number = v.nextInt();
        int i = 1;
        System.out.println("Multiplication table of "+number+" is " );
        while (i<=10) {
            System.out.println(number+ "*" +i+ "=" +(number*i));
            i++;
        }
    }    
}
