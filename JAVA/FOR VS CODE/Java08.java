/*  develop a program in Java to find the area of Rectangle using constructor. (Create a class Rectangle) */


import java.util.*;

class Rectangle
{
    int length,width,area;
    void calRectangle()
    {
        Scanner v = new Scanner(System.in);
        System.out.println("Enter the length of Rectangle");
        length = v.nextInt();
        System.out.println("Enter the width of Rectangle");
        width = v.nextInt();
    }

    void calculateRectangle()
    {
        area = length * width ;
    }
    
    void displayResult()
    {
        System.out.println("Area of Rectangle = " +area);
    }
}

class Java08{
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.calRectangle();
        r.calculateRectangle();
        r.displayResult();
    }
}
