package vaibhao;

/*	Write a program in Java to create a class Cuboid and method
	volume() to find the volume of a Cuboid. */

public class Cuboid {
	private double length;
	private double width;
	private double height;

	public Cuboid(double l, double w, double h) {
		length = l;
		width = w;
		height = h;
	}

	public double volume() {
		return length * width * height;
	}

	public static void main(String[] args) {
		Cuboid cuboid = new Cuboid(2.0, 3.0, 4.0);
		System.out.println("The volume of the cuboid is: " + cuboid.volume());
	}
}
