class Box{
    int length,width,height;
    Box(int length,int width,int height){
        this.length=length;
        this.width=width;
        this.height=height;
        int vol = length * width * height;
        System.out.println("The volume of box = " +vol);
    }
}

public class VolumeBox {
    public static void main(String[] args) {
        Box b = new Box(10, 5, 5);
    }
}
