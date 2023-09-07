package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class L6_PrintDiagonalsOfSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[n][];

        for (int row = 0; row < n; row++) {
            String[] columnData = scanner.nextLine().split(" ");

            int[] currentRow = Arrays.stream(columnData)
                    .mapToInt(elem -> Integer.parseInt(elem))
                    .toArray();
            matrix[row]=currentRow;
        }

        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][i] + " ");
        }
        System.out.println();

        for (int row = n - 1, col = 0; col < n; row--, col++) {
            System.out.print(matrix[row][col] + " ");
        }

    }
}
