/*  29) Write a program in Java to print two matrices and their multiplication by
using the concept of 2-D array. ( use matrix of size 3X3) */

package assignment;
public class que29 {
    public static void main(String[] args) {
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix2 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
        int[][] result = new int[3][3];

        // printing matrix 1
        System.out.println("Matrix 1:");
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }
        // printing matrix 2
        System.out.println("Matrix 2:");
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }
        // matrix multiplication
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                for (int k = 0; k < matrix2.length; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
    }
}