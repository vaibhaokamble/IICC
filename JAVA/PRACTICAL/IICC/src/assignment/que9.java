/*  9) Write a program in Java find the volume of box using constructor. */

package assignment;
class volumeOfBox{
    int length;
    int breadth;
    int height;
    int volume;
    volumeOfBox(int length,int breadth,int height){
        volume=length*breadth*height;
        System.out.println("Volume of the Box :"+volume);
    }
}
public class que9 {
    public static void main(String args[]){
        volumeOfBox VB=new volumeOfBox(12,11,44);
    }
}