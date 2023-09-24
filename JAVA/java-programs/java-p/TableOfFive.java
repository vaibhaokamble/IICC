public class TableOfFive {
    public static void main(String[] args) {
        int number = 5;
        System.out.println("Table of " + number);
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + number * i);
        }
    }
}