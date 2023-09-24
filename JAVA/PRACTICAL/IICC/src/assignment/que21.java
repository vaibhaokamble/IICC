/* 21) Write a program in Java to overload method volume() to find volume of
sphere and volume of rectangle.  */

package assignment;
class Shapes {
    static double pi = 3.14;
    static double volume(double r) {
        return 4.0 / 3.0 * pi * r * r * r;
    }
    static double volume(double l, double b, double h) {
        return l * b * h;
    }
}
public class que21 {
    public static void main(String[] args) {
        System.out.println("Volume of sphere: " + Shapes.volume(7.0));
        System.out.println("Volume of rectangle: " + Shapes.volume(2.0, 3.0, 4.0));
    }
}