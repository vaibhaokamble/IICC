/*  7) Write a Java program to create classes Rectangle and Box and find out
their names by using methods.   */

package assignment;

class rectangle{
    int length;
    int breadth;

    public rectangle(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public String getName(){
        return "Rectangle";
    }
    public int getResult(){
        int volume=length*breadth;
        return volume;
    }
}
class Box extends rectangle{
    int height;
    public Box(int height,int length,int breadth){
        super(length,breadth);
        this.height=height;
    }
    public String getName(){
        return "Box";
    }
    public int getResult(){
        int volume=length*breadth*height;
        return volume;
    }
}

public class que7 {
    public static void main(String[] args) {
        rectangle r=new rectangle(10,17);
        Box b=new Box(10,05,17);

        System.out.println("The name of rectangle object is "+ r.getName());
        System.out.println("The name of Box object is "+ b.getName());

        System.out.println("The volume of rectangle is : "+ r.getResult());
        System.out.println("The volume of Box is : "+ b.getResult());
    }
}