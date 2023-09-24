/* 15) Write a program in Java to create a main thread. */

package assignment;

class Mythead extends Thread{

}

public class que15 {
    public static void main(String args[]){
        Thread t=Thread.currentThread();
        System.out.println("Current thread: " + t.getName());
        t.setName("Vaibhao");
        System.out.println("After name change: " + t.getName());
        System.out.println("Main thread priority: " + t.getPriority());
    }
}