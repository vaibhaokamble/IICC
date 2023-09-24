/* 12) Write a program in Java to demonstrate finalize() method. */

package assignment;
class finalizeExample{
    public void finalize1(){
        System.out.println("Finalized Method called");
    }
}
public class que12 {
    public static void main(String args[]){
        finalizeExample f1=new finalizeExample();
        finalizeExample f2=new finalizeExample();
        f1=null;
        f2=null;
        System.gc();
        System.out.println("this was main method");
    }
}