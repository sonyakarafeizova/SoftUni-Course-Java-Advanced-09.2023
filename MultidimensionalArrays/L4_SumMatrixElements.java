package MultidimensionalArrays;

import java.util.Scanner;

public class L4_SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] rowsAndCols = scanner.nextLine().split(", ");
        int rows = Integer.parseInt(rowsAndCols[0]);
        int cols = Integer.parseInt(rowsAndCols[1]);
        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            String[] rowData=scanner.nextLine().split(", ");
            for (int col = 0; col < cols; col++) {
                matrix[row][col]=Integer.parseInt(rowData[col]);

            }

        }

        System.out.println(matrix.length);
        System.out.println(matrix[0].length);

        int sum=0;

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                sum+=matrix[row][col];

            }
        }
        System.out.println(sum);

    }
}
