/* 16) Write a program in Java to create a thread by extending a class. */

package assignment;
class MyThread extends Thread {
    public void run() {
        System.out.println("MyThread running");
    }
}
public class que16 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }
}