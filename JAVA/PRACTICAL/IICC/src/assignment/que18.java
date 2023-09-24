/* 18) Write a program in Java to create the thread by using runnable
interface. */

package assignment;
class MyRunnableThread implements Runnable {
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Thread Running: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class que18 {
    public static void main(String[] args) {
        MyRunnableThread myRunnableThread = new MyRunnableThread();
        Thread thread = new Thread(myRunnableThread);
        thread.start();
    }
}