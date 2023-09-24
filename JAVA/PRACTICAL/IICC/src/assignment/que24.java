/* 24) Write a program in Java to demonstrate the concept of method overriding. */

package assignment;
class Animal2 {
    void eat() {
        System.out.println("Eating...");
    }
}

class Dog2 extends Animal {
    @Override
    void eat() {
        System.out.println("Dog is eating...");
    }
}

public class que24 {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.eat();

        Animal d = new Dog();
        d.eat();
    }
}
