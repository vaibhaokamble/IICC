package vaibhao;

import java.lang.*;

class C extends Thread {
	public void run() {
		try {
			for (int i = 0; i <= 5; i++) {
				System.out.println("First thread" + i + "--->" + isAlive());
			Thread.sleep(1000);
			}
		} catch (Exception ex) {
			System.out.println("Error" + ex);
		}
	}
}

class D extends Thread {
	public void run() {
		try {
			for (int i = 0; i <= 10; i++) {
				System.out.println("Second thread" + i + "--->" + isAlive());
			Thread.sleep(1000);
			}
		} catch (Exception ex) {
			System.out.println("Error" + ex);
		}
	}
}

public class ThreadingBooleanApp {
	public static void main(String[] args) {
		C c = new C();
		c.start();
		D d = new D();
		d.start();
	}
}
