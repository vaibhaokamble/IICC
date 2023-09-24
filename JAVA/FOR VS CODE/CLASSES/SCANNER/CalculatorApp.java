package SCANNER;
import java.util.*;
public class CalculatorApp {
    public static void main(String[] args) {
        int a,b,add,mul,sub,div;
        Scanner v = new Scanner(System.in);
        System.out.println("Enter the any two number");
        a=v.nextInt();
        b=v.nextInt();
        add=a+b;
        System.out.println("Addition is = " +add);
        mul=a*b;
        System.out.println("Multiplication is = "+mul);
        sub=a-b;
        System.out.println("Substraction is = "+sub);
        div=a/b;
        System.out.println("Division is = "+div);
    }
}
