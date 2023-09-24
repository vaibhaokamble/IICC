/* 11) Write a program in Java to demonstrate this keyword */

package assignment;
class student{
    String name;
    int roll_number;

    student(String name,int roll_number){
        this.name=name;
        this.roll_number=roll_number;
    }
    void display(){
        System.out.println("name of student is: "+name);
        System.out.println("Roll No of student is: "+roll_number);
    }
}
public class que11 {
    public static void main(String args[]){
        student s=new student("vaibhao",003);
        s.display();
    }
}