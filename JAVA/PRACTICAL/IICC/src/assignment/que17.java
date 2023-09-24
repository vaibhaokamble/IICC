/* 17) Write a program in Java to create the two child thread by extending a
thread class. */
package assignment;
class ChildThread1 extends Thread {
    public void run() {
        System.out.println("ChildThread1 running");
    }
}
class ChildThread2 extends Thread {
    public void run() {
        System.out.println("ChildThread2 running");
    }
}
public class que17 {
    public static void main(String[] args) {
        ChildThread1 childThread1 = new ChildThread1();
        ChildThread2 childThread2 = new ChildThread2();
        childThread1.start();
        childThread2.start();
    }
}