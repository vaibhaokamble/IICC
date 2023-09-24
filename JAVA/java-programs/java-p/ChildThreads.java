public class ChildThreads extends Thread {
    public void run() {
        System.out.println("Child thread is running: " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        ChildThreads childThread1 = new ChildThreads();
        childThread1.setName("Child 1 Naresh is running");
        childThread1.start();

        ChildThreads childThread2 = new ChildThreads();
        childThread2.setName("Child 2 someone is running");
        childThread2.start();
    }
}
