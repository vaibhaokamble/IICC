public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] firstMatrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int[][] secondMatrix = { { 9, 8, 7 }, { 6, 5, 4 }, { 3, 2, 1 } };
        int[][] resultMatrix = new int[3][3];

        System.out.println("First Matrix: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(firstMatrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Second Matrix: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(secondMatrix[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    resultMatrix[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                }
            }
        }

        System.out.println("Result Matrix: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
