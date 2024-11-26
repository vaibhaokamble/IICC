package org.vaibhao;
class Add {
	int a,b;
	void setValue(int x,int y) {
		a=x;
		b=y;
	}
	void showValue() {
		System.out.println("Addition is = "+(a+b));
	}
}

public class Addition{
	public static void main(String [] args) {
		Add ad=new Add();
		ad.setValue(20,30);
		ad.showValue();
	}
}