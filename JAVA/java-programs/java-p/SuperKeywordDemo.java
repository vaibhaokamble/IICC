public class SuperKeywordDemo {
    public static void main(String[] args) {
        ChildClass childClass = new ChildClass();
        childClass.display();
    }
}

class ParentClass {
    int num1 = 10;

    public void display() {
        System.out.println("Value of num1 in Parent Class: " + num1);
    }
}

class ChildClass extends ParentClass {
    int num1 = 20;

    public void display() {
        System.out.println("Value of num1 in Child Class: " + num1);
        super.display();
    }
}