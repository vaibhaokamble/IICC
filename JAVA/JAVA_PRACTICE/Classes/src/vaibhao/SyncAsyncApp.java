package vaibhao;

class Table{
	synchronized void showTable(int x) {
		try {
			for(int i=0; i<=10; i++) {
				System.out.println("the table is = " +i*x); 
				Thread.sleep(1000);
			}
		}
		catch(Exception ex) {
			System.out.println("Error" +ex);
		}
	}
}

class Two extends Thread{
	Table t;
	void setTable(Table t) {
		this.t=t;
	}
	public void run() {
		t.showTable(5);
	}
}

class Three extends Thread{
	Table t;
	void setTable(Table t) {
		this.t=t;
	}
	public void run() {
		t.showTable(10);
	}
}
public class SyncAsyncApp {
	public static void main(String [] args) {
		Table t = new Table();
		Two t2 = new Two();
		t2.setTable(t);
		t2.start();
		Three t3 = new Three();
		t3.setTable(t);
		t3.start();
	}
}
