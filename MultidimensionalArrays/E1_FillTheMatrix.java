package MultidimensionalArrays;

import java.util.Scanner;

public class E1_FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] tokens = scanner.nextLine().split(", ");
        int n = Integer.parseInt(tokens[0]);
        String pattern = tokens[1];

        int[][] matrix = new int[n][n];

        if (pattern.equals("A")) {
            fillPatternA(matrix);
        } else {
            filPatternB(matrix);
        }

        printMatrix(matrix);
    }

    private static void printMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                System.out.print(matrix[row][col]+" ");
            }
            System.out.println();
        }
    }

    private static void fillPatternA(int[][] matrix) {
        int count = 1;
        for (int col = 0; col < matrix.length; col++) {
            for (int row = 0; row < matrix.length; row++) {
                matrix[row][col] = count++;
            }

        }
    }

    private static void filPatternB(int[][] matrix) {

        int count = 1;
        for (int col = 0; col < matrix.length; col++) {

            if ((col + 1) % 2 != 0) {
                for (int row = 0; row < matrix.length; row++) {
                    matrix[row][col] = count++;
                }

            } else {
                for (int row = matrix.length - 1; row >= 0; row--) {
                    matrix[row][col] = count++;
                }
            }
        }
    }
}
