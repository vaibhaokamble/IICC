public class MethodOverloading {

    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();

        obj.display(10);
        obj.display(10, 20);
        obj.display("Hello");
    }

    public void display(int num) {
        System.out.println("Single parameter method: " + num);
    }

    public void display(int num1, int num2) {
        System.out.println("Two parameter method: " + num1 + ", " + num2);
    }

    public void display(String str) {
        System.out.println("Single string parameter method: " + str);
    }

}
