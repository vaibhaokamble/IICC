class Animals {
  public void makeSound() {
    System.out.println("Animal makes sound");
  }
}

class Dog extends Animals {
  public void makeSound() {
    System.out.println("Dog Bark");
  }
}

public class SingleInheritanceMain {
  public static void main(String[] args) {
    Animals a = new Animals();
    a.makeSound();
    Dog d = new Dog();
    d.makeSound();

  }
}