package vaibhao;

class A1 implements Runnable{
	public void run() {
		try {
			for(int i=0; i<=10;i++) {
				System.out.println(i);
				Thread.sleep(1000);
			}
	}
		catch(Exception ex) {
			System.out.println("Error"+ex);
		}
	}
}
public class ThreadRunnableApp {
	public static void main(String [] args) {
		A1 a = new A1();
		Thread t = new Thread(a);
		t.start();
	}
}
