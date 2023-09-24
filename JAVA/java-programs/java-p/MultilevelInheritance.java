class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Mammal extends Animal {
    void sleep() {
        System.out.println("Mammal is sleeping");
    }
}

class Human extends Mammal {
    void work() {
        System.out.println("Human is working");
    }
}

public class MultilevelInheritance {
    public static void main(String args[]) {
        Human h = new Human();
        h.eat();
        h.sleep();
        h.work();
    }
}
