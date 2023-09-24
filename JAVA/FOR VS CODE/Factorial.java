
import java.util.*;

class Fact{
    int facto=1;
    int number;
    int i;
    void setFact(){
        Scanner v = new Scanner(System.in);
        System.out.println("Enter the any number");
        number = v.nextInt();
    }
    void setResult(){
        for(i=1; i<=number; i++){
            facto=facto*i;
        }
        System.out.println("Fctorial is the =" +facto);
    }
}
public class Factorial {
    public static void main(String[] args) {
        Fact f = new Fact();
        f.setFact();
        f.setResult();
    }
}
