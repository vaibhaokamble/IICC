//connstuctore overloading
public class Volume {
    double length;
    double width;
    double height;

    Volume(double l, double w, double h) {
        length = l;
        width = w;
        height = h;
    }

    Volume(double side) {
        length = side;
        width = side;
        height = side;
    }

    double volume() {
        return length * width * height;
    }

    public static void main(String[] args) {
        Volume cube = new Volume(10);
        System.out.println("Volume of the cube: " + cube.volume());

        Volume box = new Volume(10, 20, 30);
        System.out.println("Volume of the box: " + box.volume());
    }
}
