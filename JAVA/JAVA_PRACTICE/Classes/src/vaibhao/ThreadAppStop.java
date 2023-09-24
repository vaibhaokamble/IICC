package vaibhao;
import java.lang.*;
class E extends Thread{
	public void run() {
		try {
			for(int i=0;i<=10;i++) {
				System.out.println("First thread" +i+ "-->"+isAlive());
			if(i==3) {
				stop();
			}
			Thread.sleep(1000);
			}
		}
		catch(Exception ex) {
			System.out.println("Error" +ex);
		}
	}
}

class F extends Thread{
	public void run() {
		try {
			for(int i=0; i<=10;i++) {
				System.out.println("Second thread" +i+ "--->" +isAlive());
				Thread.sleep(1000);
			}
		}
		catch(Exception ex){
			System.out.println("Error" +ex);
		}
	}
}
public class ThreadAppStop {
	public static void main(String [] args) {
		E e = new E();
		e.start();
		F f = new F();
		f.start();
	}
}
