/* 23) Write a program in Java to demonstrate the concept of multilevel inheritance. */

package assignment;
class Animal1 {
    void eat() {
        System.out.println("Eating...");
    }
}

class Dog1 extends Animal {
    void bark() {
        System.out.println("Barking...");
    }
}
class BabyDog extends Dog {
    void weep() {
        System.out.println("Weeping...");
    }
}

public class que23 {
    public static void main(String[] args) {
        BabyDog bd = new BabyDog();
        bd.eat();
        bd.bark();
        bd.weep();
    }
}