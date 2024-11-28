import java.util.Random;
import java.util.Scanner;

public class exersice4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть розмірність матриці:");
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

        System.out.println("Введіть номер рядка та стовпця для мінору:");
        int row = scanner.nextInt() - 1;
        int col = scanner.nextInt() - 1;

        int[][] minor = getMinor(matrix, row, col);

        System.out.println("Мінор:");
        for (int[] r : minor) {
            for (int val : r) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static int[][] getMinor(int[][] matrix, int row, int col) {
        int size = matrix.length - 1;
        int[][] minor = new int[size][size];
        for (int i = 0, minorRow = 0; i < matrix.length; i++) {
            if (i == row) continue;
            for (int j = 0, minorCol = 0; j < matrix[i].length; j++) {
                if (j == col) continue;
                minor[minorRow][minorCol++] = matrix[i][j];
            }
            minorRow++;
        }
        return minor;
    }
}