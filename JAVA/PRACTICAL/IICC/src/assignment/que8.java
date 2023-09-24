/*  8) Write a Java program to find the volume of box using method.(create
method volume()) */

package assignment;
class Box1 {
    int length;
    int breadth;
    int height;

    public Box1(int length, int breadth, int height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
        System.out.println("volume of Box is below");
    }
    public int volume(){
        return length*breadth*height;
    }
}
public class que8 {
    public static void main(String args[]) {
        Box1 B1=new Box1(11,12,13);
        System.out.println("the volume = "+B1.volume());
    }
}