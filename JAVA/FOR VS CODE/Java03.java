/*  develop a program in Java to demonstrate the switch....case statement.  */

import java.util.*;
public class Java03 {
    public static void main(String[] args) {
        Scanner v = new Scanner(System.in);
        System.out.println("Enter the any value");
        int number = v.nextInt();
        switch (number) {
            case 1:
            System.out.println("Monday");                
                break;
            
            case 2:
            System.out.println("Tuesday");
            break;

            case 3:
            System.out.println("Wednesday");
            break;

            case 4:
            System.out.println("Thursday");
            break;

            case 5:
            System.out.println("friday");
            break;

            case 6:
            System.out.println("Saturday");
            break;

            case 7:
            System.out.println("Sunday");
            break;

            default:
            System.out.println("I Think You Enter Wrong Key");
            break;
        }
    }
}
