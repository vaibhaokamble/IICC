import java.util.Scanner;

/*  develop a program in Java to demonstrate the do.....while statement.  */

import java.util.*;

public class Java05 {
    public static void main(String[] args) {
        Scanner v = new Scanner(System.in);
        System.out.println("Enter the any number = ");
        int number = v.nextInt();
        int i = 1;
        do{
            System.out.println(i);
            i++;
        }
        while(i<=number);
    }    
}
