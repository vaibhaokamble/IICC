package assignment;
/* 1) Write a Java program to find the volume of box */

class FindVolume{
    int length;
    int height;
    int width;

    FindVolume(int length,int height,int width){
        int volume = length * height * width;
        System.out.println("The volume of Box = " +volume);
    }
}

public class que1 {
    public static void main(String[] args) {
        FindVolume fv = new FindVolume(10,20,30);
    }
}
