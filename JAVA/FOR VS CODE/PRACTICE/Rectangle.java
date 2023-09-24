class DemoRectangle{
    int a ,b, area;

    DemoRectangle(int a,int b){
        this.a=a;
        this.b=b;
        area = a * b;
        System.out.println("Enter the area of Rectangle = " +area);
    }
}

public class Rectangle {
    public static void main(String[] args) {
        DemoRectangle d = new DemoRectangle(5, 5);        
    }
}
