package org.vaibhao;

import java.util.*;

class Employe {
	String name;
	int id, basicsal, incSal;

	void setPersonalInfo(String n, int i, int bSal) {
		name = n;
		id = i;
		basicsal = bSal;// in this function we need to store name ,id and basicSal in instance variable
	}

	void setProgressPer(int progress) {
		if (progress > 60)// if progress value is greater than 60 per then increase the basic salary of
		{
			incSal = basicsal * 30 / 100; // employee with 30 percentage
		}
	}

	void show() {
		int totalsalary = basicsal + incSal;// in this function we need to show the all details of employee like as
		System.out.println("Name is " + name);// name id and basic salary as well as incremental salary and total salary
												// of employee
		System.out.println("id is " + id);
		System.out.println("basic salary is " + basicsal);
		System.out.println("Increment salary is " + incSal);
		System.out.println("Total salary is " + totalsalary);
	}
}

public class AreaEmpApp {

	public static void main(String[] args) {
		Scanner v = new Scanner(System.in);// here create the object of Scanner class and accept the name id and basic
											// salary as well
		System.out.println("Enter the name id and salary of employee");// progress per value not need to calculate it by
																		// using formual directly enter e.g 70
		String name = v.next();// means 70%
		int id = v.nextInt();
		int basicsal = v.nextInt();
		Employe em = new Employe();// create the object of Employee class and call setPersonalInfo and pass name id
									// and salary
		em.setPersonalInfo(name, id, basicsal);// in it as well as setProgressPer() and pass progress value in it
		em.setProgressPer(basicsal);
		em.show();// call the show() method of Employee class.

	}

}
