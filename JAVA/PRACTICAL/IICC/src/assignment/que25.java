/* 25) Write a program in Java to demonstrate the use of super keyword. */
package assignment;
class Parent {
    int x = 10;
    void show() {
        System.out.println("In Parent class");
    }
}
class Child extends Parent {
    int x = 20;
    void show() {
        System.out.println("In Child class");
        System.out.println("Accessing parent class variable x: " + super.x);
        super.show();
    }
}
public class que25 {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.show();
    }
}