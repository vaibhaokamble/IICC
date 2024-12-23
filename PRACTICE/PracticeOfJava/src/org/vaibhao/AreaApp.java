/* 2.Create the Class Name as Rectangle methods and write its logics.*/
package org.vaibhao;

import java.util.*;

class Rectangle {
	float length, width;

	void setLengthWidth(float len, float wid)// accept the length and width
	{
		length = len;
		width = wid;
	}

	void showArea() {
		System.out.println("The area of Rectangle = " + (length * width));// write here calculation logics of rectangle
																			// area and display it
	}
}

public class AreaApp {
	public static void main(String x[]) {
		Scanner v = new Scanner(System.in);// create here object of scanner and accept the length and width as input
		System.out.println("Enter the length");
		float length = v.nextFloat();
		System.out.println("Enter the width");
		float width = v.nextFloat();
		Rectangle r = new Rectangle();// create the object of Rectangle and call setLengthWidth and pass radius input
										// as parameter
		r.setLengthWidth(length, width);
		r.showArea();// call showArea() for display the display the area
	}
}
