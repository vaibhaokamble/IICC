package org.vaibhao;

import java.util.*;

class InsertArrEle {
	char c[];

	void setCharArray(char ch[]) {
		c = ch;
	}

	void insertValueOnIndex(int index, char ch) {
		System.out.println("Before Sorting Charecter\n");
		for (int i = 0; i < c.length; i++) {
			System.out.printf("c[%d]-->%c\n", i, c[i]);
		}
		for (int i = (c.length - 2); i >= index; i--) {
			c[i + 1] = c[i];
		}
		c[index] = ch;
		System.out.println("After Inserting Charecter\n");
		for (int i = 0; i < c.length; i++) {
			System.out.printf("c[%d]-->%c\n", i, c[i]);
		}
	}
}

public class InsertArrEleApp {
	public static void main(String[] args) {
		InsertArrEle e = new InsertArrEle();
		Scanner v = new Scanner(System.in);
		char ch[] = new char[6];
		System.out.println("Enter the value in array charecter array");
		for (int i = 0; i < (ch.length - 1); i++) {
			ch[i] = v.nextLine().charAt(0);
		}
		e.setCharArray(ch);
		System.out.println("Enter the values and index");
		char value = v.nextLine().charAt(0);
		int index = v.nextInt();
		e.insertValueOnIndex(index, value);
	}
}
