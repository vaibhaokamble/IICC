package SCANNER;
import java.util.*;
public class ScannerApp{
    public static void main(String[] args) {
        Scanner v = new Scanner(System.in);
        int id;
        String name;
        int salary;
        System.out.println("Enter the name id and salary");
        name=v.nextLine();
        id=v.nextInt();
        salary=v.nextInt();
        System.out.println("the id is =" +id);
        System.out.println("the name = "+name);
        System.out.println("the salary = "+salary);
    }
}