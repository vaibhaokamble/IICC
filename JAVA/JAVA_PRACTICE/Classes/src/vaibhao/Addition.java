package vaibhao;
class Additions{
	int a,b,c;
	Additions(int a, int b){
		this.a=a;
		this.b=b;
	}
	void setAdd() {
		c = a + b;
	}
	void setResult() {
		System.out.println("Addition is = " +c);
	}
}
public class Addition {
	public static void main(String [] args) {
		Additions a = new Additions(3,5);
		a.setAdd();
		a.setResult();
	}
}
