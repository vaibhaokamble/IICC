package vaibhao;

/*	Write a program in Java to overload the area() method to calculate
area of a rectangle and square. (create appropriate class and object). */
public class AreaCalculator {
	public int area(int length, int width) {
		return length * width;
	}

	public int area(int side) {
		return side * side;
	}

	public static void main(String[] args) {
		AreaCalculator calc = new AreaCalculator();

		// Calculate area of a rectangle
		int length = 10;
		int width = 5;
		int rectArea = calc.area(length, width);
		System.out.println("Area of rectangle with length " + length + " and width " + width + " is " + rectArea);

		// Calculate area of a square
		int side = 8;
		int squareArea = calc.area(side);
		System.out.println("Area of square with side " + side + " is " + squareArea);
	}
}
