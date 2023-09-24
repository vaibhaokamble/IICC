class MyClass {

    void showMyName(String name) {
        System.out.println("Your name is " + name);
    }
}

public class referenceobj {

    public static void main(String[] args) {
        // Creating reference to hold object of MyClass
        MyClass myClass = new MyClass();
        myClass.showMyName("Naresh Kanode");
    }
}