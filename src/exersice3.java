import java.util.Scanner;

public class exersice3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = 5;
        int[][] matrix = new int[size][size];

        System.out.println("Введіть елементи матриці 5x5:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int determinant = calculateDeterminant(matrix);
        System.out.println("Визначник матриці: " + determinant);
    }

    public static int calculateDeterminant(int[][] matrix) {
        if (matrix.length == 1) return matrix[0][0];

        int determinant = 0;
        for (int i = 0; i < matrix.length; i++) {
            determinant += Math.pow(-1, i) * matrix[0][i] * calculateDeterminant(getMinor(matrix, i));
        }
        return determinant;
    }

    public static int[][] getMinor(int[][] matrix, int col) {
        int size = matrix.length - 1;
        int[][] minor = new int[size][size];
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 0, minorCol = 0; j < matrix.length; j++) {
                if (j != col) {
                    minor[i - 1][minorCol++] = matrix[i][j];
                }
            }
        }
        return minor;
    }
}