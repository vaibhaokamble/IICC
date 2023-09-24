public class ObjectReference {
  public static void main(String[] args) {
    Student student1 = new Student();

    student1.rollNo = 1;
    student1.name = "Naresh";

    Student student2 = student1;

    System.out.println("Roll No: " + student2.rollNo);
    System.out.println("Name: " + student2.name);
  }
}

class Student {
  int rollNo;
  String name;
}
