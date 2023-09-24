package vaibhao;

/* Write a program in Java to create a thread by implementing
	Runnable interface.*/
public class MyThread implements Runnable {
	private String message;

	public MyThread(String message) {
		this.message = message;
	}

	public void run() {
		System.out.println("Thread started: " + Thread.currentThread().getName());
		for (int i = 0; i < 5; i++) {
			System.out.println(message);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Thread ended: " + Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		MyThread myThread = new MyThread("Hello from my thread!");
		Thread thread = new Thread(myThread);
		thread.start();
	}
}
