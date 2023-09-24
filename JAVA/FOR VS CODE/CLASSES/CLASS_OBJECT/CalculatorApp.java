package CLASS_OBJECT;

import java.util.Scanner;

class Calculate{
    int a,b,c;
    void setValue(int a,int b){
        this.a=a;
        this.b=b;
    }
    void setAdd(){
        c=a+b;
    }
    void showAdd(){
        System.out.println("the addition is = " +c);
    }
    
    void setSub(){
        c=a-b;
    }
    void showSub(){
        System.out.println("the substraction is = " +c);
    }
    void setMul(){
        c=a*b;
    }
    void showMul(){
        System.out.println("the multiplication is = " +c);
    }
    void setDiv(){
        c=a/b;
    }
    void showDiv(){
        System.out.println("the division is = " +c);
    }
    
}
public class CalculatorApp {
    public static void main(String[] args) {
        Calculate cal= new Calculate();
        Scanner sc = new Scanner(System.in);
        cal.setValue(100, 200);
        cal.setAdd();
        cal.showAdd();
        cal.setSub();
        cal.showSub();
        cal.setMul();
        cal.showMul();
        cal.setDiv();
        cal.showDiv();
    }
}
