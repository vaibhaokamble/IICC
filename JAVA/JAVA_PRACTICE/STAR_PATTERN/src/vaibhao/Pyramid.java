package vaibhao;

public class Pyramid {
    public static void main(String[] args) {
        int i,j;
        for( i=0; i<5; i++) // outer loop for number of row
        {
            System.out.print(" "); // print space
        
        }
            for(j=0; j<=i; j++) //inner loop for number of column
        {
            System.out.print("*"); //print star
        }
        System.out.println(); //ending line after each row
    }
}
