/*  develop a program in Java that demonstrates the Boolean data type. */
import java.util.*;
public class Java01 {
    public static void main(String args [])
    {
        Scanner v = new Scanner(System.in);
        System.out.println("Enter the first number ");
        int number1 = v.nextInt();
        System.out.println("Enter the second number");
        int number2 = v.nextInt();
        boolean b1 = true;
        boolean b2 = false;
        if(number1<number2)
        {
            System.out.println("Second Number Is Greater = " +b1);
        }
        else
        {
            System.out.println("First Number  Is Greater = "  +b2);
        }
    }
}
