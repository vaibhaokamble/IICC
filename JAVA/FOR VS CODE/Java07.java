/*  develop a program in Java to Create a class box and find the volume of two box objects.  */

import java.util.*;

public class Java07 {
    public static void main(String[] args) {
        Scanner v = new Scanner(System.in);
        System.out.println("Enter the length of box");
        int length = v.nextInt();
        System.out.println("Enter the Breadth of box");
        int breadth = v.nextInt();
        System.out.println("Enter the Height Of Box");
        int height = v.nextInt();
        int volume = length * breadth * height ;
        System.out.println("The Volume of the box is = " + volume);        
    }
}
