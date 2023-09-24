/* 2) Write a Java program to find the volume of two boxes. */

package assignment;

public class que2 {
    double width;
    double height;
    double depth;

    double volume(){
        return  width * height * depth;
    }
    void getValue(){
        System.out.println("Value of box = " + volume());
    }
    public static void main(String[] args) {
     que2 box1 = new que2();
     que2 box2 = new que2();

     box1.width=21;
     box1.height=22;
     box1.depth=23;

     box2.width=19;
     box2.height=18;
     box2.depth=16;

     box1.getValue();
     box2.getValue();
    }
}
