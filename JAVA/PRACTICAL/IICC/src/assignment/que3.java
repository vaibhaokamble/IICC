/* 3) Write a Java program to find the area of rectangle */

package assignment;

public class que3 {
    double length;
    double width;

    double area(){
        return length * width;
    }
    void printResult(){
        System.out.println("area of rectangle = " +area());
    }

    public static void main(String[] args) {
        que3 q = new que3();
        q.length=20;
        q.width=30;
        q.area();
        q.printResult();
    }
}
