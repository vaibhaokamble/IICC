package org.vaibhao;
import java.util.*;

class Square{
	int number;
	void setSquare(int a) {
		number=a;
	}
	void showSquare() {
		System.out.println("The Square is = " +(number*number));
	}
}
public class SquareApp {
	public static void main(String args []) {
		int number;
		Scanner v=new Scanner(System.in);
		System.out.println("Enter the any number");
		number=v.nextInt();
		Square sq=new Square();
		sq.setSquare(number);
		sq.showSquare();
	}
}
