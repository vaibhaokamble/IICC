/*  5) Write a Java program to assign the object reference variable.   */

package assignment;

public class que5 {
    int student_id;
    String name;
    String address;

    que5(int student_id,String name, String address){
        this.student_id=student_id;
        this.name=name;
        this.address=address;
        System.out.println("this is a constructor method");
    }

    public static void main(String[] args) {
        que5 q1 = new que5(1 ,"vaibhao","wardha");
        que5 q2 = new que5(2 ,"akshat","bahera");
        System.out.println(" id is = " +q1.student_id + "\n name is = " +q1.name + "\n address is = " +q1.address);
        System.out.println(" id is = " +q2.student_id + "\n name is = " +q2.name + "\n address is = " +q2.address);
        q2=q1;
        System.out.println("after assigning object reference variable");
        System.out.println(" id is = " +q1.student_id + "\n name is = " +q1.name + "\n address is = " +q1.address);
        System.out.println(" id is = " +q2.student_id + "\n name is = " +q2.name + "\n address is = " +q2.address);
    }
}