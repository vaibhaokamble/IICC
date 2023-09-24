package vaibhao;
import java.util.*;

class Employee{
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
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	private String name;
	private int sal;
}
public class VectorApp {
	public static void main(String [] args) {
		Vector v = new Vector();
		Employee e1=new Employee();
		e1.setId(1);
		e1.setName("vaibhao");
		e1.setSal(1000);
		
		Employee e2 =new Employee();
		e2.setId(2);
		e2.setName("akshat");
		e2.setSal(2000);
		
		Employee e3= new Employee();
		e3.setId(3);
		e3.setName("its demo");
		e3.setSal(3000);
		
		v.add(e1);
		v.add(e2);
		v.add(e3);
		
		Iterator i =v.iterator();
		while(i.hasNext()) {
			Object obj =i.next();
			Employee emp=(Employee)obj;
			System.out.println(emp.getId() +"	"+ emp.getName()+"	" + emp.getSal());
		}
	}
}
