/* 13) Write a program in Java to compute volume of box and cube by using
constructor overloading. */

package assignment;
class volume{
    int length;
    int breadth;
    int height;

    volume(int length,int breadth,int height){
        int v2= length*breadth*height;
        System.out.println("Volume of box: "+v2);
    }
    volume(int x){
        height=length=breadth=x;
        int v3= x*x*x;
        System.out.println("volume of cube : "+v3);
    }
}
public class que13 {
    public static void main(String args[]){
        volume v=new volume(11,15,20);
        volume v1=new volume(22);
    }

}