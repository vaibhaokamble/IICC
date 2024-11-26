package org.vaibhao;
import java.util.*;
class Employee{
	private String name;
	private int id;
	private float salary;
	
	void setEmployee(String n,int i,float s) {
		name=n;
		id=i;
		salary=s;
	}
	void showEmployee() {
		System.out.println(name +"\t\t"+id +"\t"+salary);
	}
}
public class EmployeeApp {
	public static void main(String [] args) {
		Scanner v=new Scanner(System.in);
		System.out.println("enter the details of employee");
		String name=v.nextLine();
		int id=v.nextInt();
		float salary=v.nextFloat();
		Employee emp= new Employee();
		emp.setEmployee(name, id, salary);
		emp.showEmployee();
	}
}
