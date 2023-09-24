/* 14) Write a program in Java to demonstrate concept of reference to object */

package assignment;
class Employee{
    String name;
    int emp_id;

    Employee(String name,int emp_id){
        this.name=name;
        this.emp_id=emp_id;
    }
    public String getName(){
        return name;
    }
    public int getEmp_id(){
        return emp_id;
    }
    public String setName(String name){
        this.name=name;
        return name;
    }
}
public class que14 {
    public static void main(String args[]){
        Employee em=new Employee("vaibhao",003);
        Employee em1=em;
        //instance of Student named student1 and assigned it to student2 using student2 = student1.

        System.out.println("Before Reference Object");
        System.out.println("Employee name is : "+em.getName());
        System.out.println("Employee Id is : " +em.getEmp_id());

        System.out.println();
        System.out.println("Run with reference object ");
        System.out.println("Employee name is : "+em1.getName());
        System.out.println("Employee Id is : " +em1.getEmp_id());

        //Set the name and run with reference instance
        em1.setName("akshat");
        System.out.println("Employee name is : "+em.getName());
        System.out.println("Employee name is : "+em1.getName());
    }
}