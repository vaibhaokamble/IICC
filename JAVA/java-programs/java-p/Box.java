class Box {
	double width;
	double height;
	double depth;

	Box(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}

	double volume() {
		return width * height * depth;
	}
}

class BoxDemo {
	public static void main(String args[]) {

		Box mybox1 = new Box(10, 10, 10);
		// Box mybox2 = new Box(20, 20, 20);

		double vol;

		vol = mybox1.volume();
		System.out.println("Volume of first box : " + vol);

		// vol = mybox2.volume();
		// System.out.println("Volume of second box : " + vol);
	}
}