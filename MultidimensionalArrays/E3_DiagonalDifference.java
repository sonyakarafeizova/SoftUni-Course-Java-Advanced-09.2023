package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class E3_DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[n][n];

        fillMatrix(matrix, scanner);

        int sumPrimary = getPrimaryDiagonalSum(matrix);
        int sumSecondary = getSecondaryDiagonalSum(matrix);

        System.out.println(Math.abs(sumPrimary - sumSecondary));

    }

    private static int getSecondaryDiagonalSum(int[][] matrix) {
        int sumSecondary = 0;
        for (int row = matrix.length - 1; row >= 0; row--) {

            sumSecondary += matrix[row][matrix.length - 1 - row];
        }
        return sumSecondary;

    }

    private static int getPrimaryDiagonalSum(int[][] matrix) {
        int sumPr = 0;
        for (int i = 0; i < matrix.length; i++) {
            sumPr += matrix[i][i];//sum primary diagonal

        }
        return sumPr;

    }

    private static void fillMatrix(int[][] matrix, Scanner scanner) {
        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

    }
}
