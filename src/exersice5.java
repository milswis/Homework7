import java.util.Random;
import java.util.Scanner;

public class exersice5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть розмірність квадратної матриці:");
        int size = scanner.nextInt();

        int[][] matrix = new int[size][size];
        Random random = new Random();

        System.out.println("Згенерована матриця:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = random.nextInt(10);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int[][] transposed = transpose(matrix);

        System.out.println("\nТранспонована матриця:");
        for (int[] row : transposed) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static int[][] transpose(int[][] matrix) {
        int size = matrix.length;
        int[][] transposed = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        return transposed;
    }
}