package vaibhao;
import java.lang.*;

class A extends Thread{
	public void run() {
		try {
			for(int i=0;i<=10;i++) {
				System.out.println("The first thread is = " +i);
				Thread.sleep(1000);
			}
		}
		catch(Exception ex) {
			System.out.println("Error is "+ex);
		}
	}
}

class B extends Thread{
	public void run() {
		try {
			for(int i=0;i<50;i++) {
				Thread.sleep(1000);
			}
		}
		catch(Exception ex) {
			System.out.println("The second thread");
		}
	}
}
public class ThreadingApplication {
	public static void main(String [] args) {
		A a = new A();
		a.start();
		B b = new B();
		b.start();
	}
}
