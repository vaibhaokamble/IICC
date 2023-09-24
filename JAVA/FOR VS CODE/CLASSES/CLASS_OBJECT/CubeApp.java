package CLASS_OBJECT;

class Cube{
    int number;
    void setValue(int x){
        number=x;
    }
    void showResult(){
        System.out.println("The cube is = " +number*number*number);
    }
}
public class CubeApp {
    public static void main(String[] args) {
        Cube c = new Cube();
        c.setValue(5);
        c.showResult();
    }
}
