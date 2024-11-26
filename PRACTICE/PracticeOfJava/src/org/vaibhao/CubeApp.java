package org.vaibhao;
import java.util.*;
class Cube{
	int number;
	void setCube(int x) {
		number=x;
	}
	void showCube() {
		System.out.println("The cube is = "+(number*number*number));
	}
}
public class CubeApp {

	public static void main(String[] args) {
		int number;
		Scanner v=new Scanner(System.in);
		System.out.println("Enter the any number");
		number=v.nextInt();
		Cube c =new Cube();
		c.setCube(number);
		c.showCube();
	}
}
