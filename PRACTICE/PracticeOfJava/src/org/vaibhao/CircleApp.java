/* WAP to create the class name as Circle with a following methods */
package org.vaibhao;
import java.util.*;
class Circle{
	float radius;
	void setCircle(float r) {
		radius=r;
	}
	void showCircle() {
		System.out.println("The area of circle is = "+3.14*radius*radius);
	}
}
public class CircleApp {

	public static void main(String[] args) {
		Scanner v=new Scanner(System.in);
		System.out.println("Enter the anu radius of cicle = ");
		float radius=v.nextFloat();
		Circle c=new Circle();
		c.setCircle(radius);
		c.showCircle();
	}
}
