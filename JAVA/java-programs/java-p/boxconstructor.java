public class boxconstructor {

    double width;
    double height;
    double depth;

    boxconstructor() {

        width = 10;
        height = 10;
        depth = 10;
    }

    double volume() {
        return width * height * depth;
    }
}

class boxvolume {
    public static void main(String args[]) {

        boxconstructor box = new boxconstructor();
        double vol;
        vol = box.volume();
        System.out.println("Volume of the first box is " + vol);

    }
}
