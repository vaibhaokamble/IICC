/* 19) Write a program in Java to create child thread by implementing runnable interface. */

package assignment;
class ChildThread implements Runnable {
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Child Thread Running: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class que19 {
    public static void main(String[] args) {
        ChildThread childThread = new ChildThread();
        Thread thread = new Thread(childThread);
        thread.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread Running: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}