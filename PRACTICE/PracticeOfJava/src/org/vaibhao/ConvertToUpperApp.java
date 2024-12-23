package org.vaibhao;

class ConvertToUpper {
	char ch[];

	void setCharArray(char c[]) {
		ch = c;
	}

	void convertToUpper() {
		System.out.println("Before the conversion");
		for (int i = 0; i < ch.length; i++) { // Change <= to <
			System.out.printf("ch[%d]-->%c\n", i, ch[i]);
		}
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 'a' && ch[i] <= 'z') {
				int c = (int) ch[i] - 32;
				ch[i] = (char) c;
			}
		}
		System.out.println("After Conversion is");
		for (int i = 0; i < ch.length; i++) {
			System.out.printf("ch[%d]-->%c\n", i, ch[i]);
		}
	}
}

public class ConvertToUpperApp {

	public static void main(String[] args) {
		ConvertToUpper cp = new ConvertToUpper();
		char ch[] = new char[] { 'v', 'a', 'i', 'b', 'h', 'a', 'v' };
		cp.setCharArray(ch);
		cp.convertToUpper();
	}
}
