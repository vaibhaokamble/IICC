/*  6) Write a Java program to assign the one object to another object. */

package assignment;
 class ref{
     int x=22;
     int y=33;

     ref(int x, int y){
         this.x=x;
         this.y=y;
     }
 }
public class que6 {
    public static void main(String[] args) {
        ref r1 = new ref(10,17);
        ref r2=r1;
        System.out.println("r1 x= " +r1.x + "  r1 y ="+r1.y);
        System.out.println("r2 x= " +r2.x + "  r2 y ="+r2.y);
    }
}
