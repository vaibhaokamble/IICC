/* 20) Write a program in Java to demonstrate isAlive() and join() method of a thread.*/

package assignment;
class WorkerThread implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Worker Thread Running: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class que20 {
    public static void main(String[] args) {
        WorkerThread workerThread = new WorkerThread();
        Thread thread = new Thread(workerThread);
        thread.start();

        System.out.println("Is worker thread alive? " + thread.isAlive());

        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Is worker thread alive? " + thread.isAlive());
    }
}