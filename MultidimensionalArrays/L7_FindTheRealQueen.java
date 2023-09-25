package MultidimensionalArrays;

import java.util.Scanner;

public class L7_FindTheRealQueen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[][] chessMatrix = new char[8][8];

        for (int i = 0; i < chessMatrix.length; i++) {
            String input = scanner.nextLine().replaceAll("\\s+", "");
            chessMatrix[i] = input.toCharArray();
        }

        int[] indexQueen = new int[2];
        boolean isFound = false;

        for (int i = 0; i < chessMatrix.length; i++) {
            for (int j = 0; j < chessMatrix[i].length; j++) {
                char currentChar = chessMatrix[i][j];
                if (currentChar == 'q') {
                    boolean colon = false;
                    boolean rows = false;
                    for (int k = i; k <= i; k++) {
                        for (int l = j + 1; l < chessMatrix[i].length; l++) {
                            char checkingChar = chessMatrix[i][l];
                            if (checkingChar == 'q') {
                                colon = true;
                                break;
                            }
                        }
                    }

                    for (int k = i + 1; k < chessMatrix.length; k++) {
                        if (chessMatrix[k][j] == 'q') {
                            rows = true;
                            break;
                        }
                    }

                    if (!colon && !rows && !diagonally(chessMatrix, i, j)) {
                        indexQueen[0] = i;
                        indexQueen[1] = j;
                        isFound = true;
                    }
                }
                if (isFound) {
                    break;
                }
            }
            if (isFound) {
                break;
            }
        }
        for (int i = 0; i < indexQueen.length; i++) {
            System.out.printf("%d ", indexQueen[i]);
        }
    }

    private static boolean diagonally(char[][] matrix, int row, int cols) {
        int index = cols;
        if (row == 0) {
            for (int i = 1; i < matrix.length; i++) {
                cols++;
                if (cols > matrix.length - 1) {
                    break;
                }
                if (matrix[i][cols] == 'q') {
                    return true;
                }
            }
            cols = index;
            for (int i = 1; i < matrix.length; i++) {
                cols--;
                if (cols < 0) {
                    break;
                }
                if (matrix[i][cols] == 'q') {
                    return true;
                }
            }
        } else if (row == matrix.length - 1) {
            for (int i = row - 1; i >= 0; i--) {
                cols--;
                if (cols < 0) {
                    break;
                }
                if (matrix[i][cols] == 'q') {
                    return true;
                }
            }
            cols = index;
            for (int i = row - 1; i >= 0; i--) {
                cols++;
                if (cols > matrix.length - 1) {
                    break;
                }
                if (matrix[i][cols] == 'q') {
                    return true;
                }
            }
        } else {
            for (int i = row + 1; i < matrix.length; i++) {
                cols++;
                if (cols > matrix.length - 1) {
                    break;
                }
                if (matrix[i][cols] == 'q') {
                    return true;
                }
            }
            cols = index;
            for (int i = row + 1; i < matrix.length; i++) {
                cols--;
                if (cols < 0) {
                    break;
                }
                if (matrix[i][cols] == 'q') {
                    return true;
                }
            }

            cols = index;
            for (int i = row - 1; i > +0; i--) {
                cols--;
                if (cols < 0) {
                    break;
                }
                if (matrix[i][cols] == 'q') {
                    return true;
                }
            }
            cols = index;
            for (int i = row - 1; i >= 0; i--) {
                cols++;
                if (cols > matrix.length - 1) {
                    break;
                }
                if (matrix[i][cols] == 'q') {
                    return true;
                }
            }
        }
        return false;
    }
}