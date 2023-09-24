package CLASS_OBJECT;

class Square{
    int number;
    void setValue(int x){
        number=x;
    }
    void showResult(){
        System.out.println("The sqaure is = " +number*number);
    }
}
public class SquareApp {
    public static void main(String[] args) {
        Square s = new Square();
        s.setValue(5);
        s.showResult();
    }
}
