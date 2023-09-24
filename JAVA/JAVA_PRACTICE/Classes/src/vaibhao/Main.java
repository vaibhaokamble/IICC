package vaibhao;
class Test extends Exception{
	
}
public class Main {
	public static void main(String []args) {
		try {
			throw new Test();
		}
		catch(Test t) {
			System.out.println("Got test exception");
		}
		finally {
			System.out.println("Inside finally block");
		}
	}
}
