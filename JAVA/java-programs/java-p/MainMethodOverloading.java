class Volume {
    public void volume(int r) {
        System.out.println("Volume of sphere: " + (4 / 3) * 3.14 * r * r * r);
    }

    public void volume(int l, int b, int h) {
        System.out.println("Volume of rectangle: " + l * b * h);
    }
}

public class MainMethodOverloading {
    public static void main(String[] args) {
        Volume v = new Volume();
        v.volume(5);
        v.volume(5, 10, 15);
    }
}
