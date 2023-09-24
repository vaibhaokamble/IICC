class ChildThread implements Runnable {
  public void run() {
    System.out.println("Child thread is running");
  }
}

public class singlechildn {
  public static void main(String[] args) {
    ChildThread childThread = new ChildThread();
    Thread thread = new Thread(childThread);
    thread.start();
    System.out.println("Main thread is running");
  }
}
