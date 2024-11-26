package org.vaibhao;

class Student{
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	private String name;
	private int salary;
}
class Admission{
	Student stud;
	void addNewStudent(Student student) {
		stud=student;
	}
	void show() {
		System.out.println(stud.getName()+"\t\t"+stud.getId()+"\t"+stud.getSalary());
	}
}
public class AdmissionApp {

	public static void main(String[] args) {
		Admission ad =new Admission();
		Student s = new Student();
		s.setId(1);
		s.setName("vaibhao");
		s.setSalary(190000);
		ad.addNewStudent(s);
		ad.show();
	}

}
