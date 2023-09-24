/*   4) Write a Java program to find the area of circle   */

package assignment;

public class que4 {
    double radius;
    double pi=3.14;

    double areaCircle(){
        return  radius * radius * pi;
    }
    void getResult(){
        System.out.println("area of circle = " +areaCircle());
    }

    public static void main(String[] args) {
        que4 q = new que4();
        q.radius=5;
        q.areaCircle();
        q.getResult();
    }
}
