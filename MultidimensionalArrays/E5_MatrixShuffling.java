package MultidimensionalArrays;

import java.util.Scanner;

public class E5_MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] tokens = scanner.nextLine().split("\\s+");
        int rows = Integer.parseInt(tokens[0]);
        int cols = Integer.parseInt(tokens[1]);
        String [][]matrix=readMatrix(rows,scanner, " ");

        String input= scanner.nextLine();

        while(!input.equals("END")){

            if (isValidInput(input, rows, cols)) {
                int firstElRow = Integer.parseInt(input.split(" ")[1]);
                int firstElCol = Integer.parseInt(input.split(" ")[2]);
                int secondElRow = Integer.parseInt(input.split(" ")[3]);
                int secondELCol = Integer.parseInt(input.split(" ")[4]);
                doSwap(firstElRow, firstElCol, secondElRow, secondELCol, matrix);
                printStrMatrix(matrix);
            } else {
                System.out.println("Invalid input!");
            }




            input= scanner.nextLine();
        }



    }

    public static String[][] readMatrix(int rows, Scanner scanner, String delimiter) {
        String[][] matrix = new String[rows][];
        for (int r = 0; r < matrix.length; r++) {
            String[] row = scanner.nextLine().split(delimiter);
            matrix[r] = row;
        }
        return matrix;
    }
    private static boolean isValidInput(String command, int maxRows, int maxCols) {
        String[] commandData = command.split(" ");
        if (commandData.length != 5) {
            return false;
        }
        if (!commandData[0].equals("swap")) {
            return false;
        }
        return isValidIndex(commandData[1], maxRows) && isValidIndex(commandData[2], maxCols)
                && isValidIndex(commandData[3], maxRows) && isValidIndex(commandData[4], maxCols);
    }
    private static void doSwap(int firstElRow, int firstElCol, int secondElRow, int secondELCol, String[][] matrix) {
        String temp = matrix[firstElRow][firstElCol];
        matrix[firstElRow][firstElCol] = matrix[secondElRow][secondELCol];
        matrix[secondElRow][secondELCol] = temp;

    }
    public static void printStrMatrix(String[][] matrix) {
        for (String[] row : matrix) {
            System.out.println(String.join(" ", row));
        }
    }

    public static boolean isValidIndex(String val, int maxValue) {
        int valToInt = Integer.parseInt(val);
        return 0 <= valToInt && valToInt < maxValue;
    }
}
