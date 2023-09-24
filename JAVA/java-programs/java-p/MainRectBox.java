class Rectangle {
  int length;
  int width;

  public Rectangle(int length, int width) {
    this.length = length;
    this.width = width;
  }

  public void printName() {
    System.out.println("This is a Rectangle");
  }
}

class Box2 {
  int height;
  int length;
  int width;

  public Box2(int height, int length, int width) {
    this.height = height;
    this.length = length;
    this.width = width;
  }

  public void printName() {
    System.out.println("This is a Box");
  }
}

public class MainRectBox {
  public static void main(String[] args) {
    Rectangle rect = new Rectangle(10, 5);
    rect.printName();

    Box2 box = new Box2(10, 20, 30);
    box.printName();
  }
}