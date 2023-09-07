package MultidimensionalArrays;

import java.util.Scanner;

public class L3_IntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rowsM = Integer.parseInt(scanner.nextLine());
        int colsN = Integer.parseInt(scanner.nextLine());
        char[][] firstMatrix = new char[rowsM][colsN];
        char[][] secondMatrix = new char[rowsM][colsN];

        for (int i = 0; i < firstMatrix.length; i++) {
            String[] current = scanner.nextLine().split(" ");
            for (int j = 0; j < firstMatrix[i].length; j++) {
                firstMatrix[i][j] = current[j].charAt(0);
            }
        }

        for (int i = 0; i < secondMatrix.length; i++) {
            String[] current = scanner.nextLine().split(" ");
            for (int j = 0; j <secondMatrix[i].length ; j++) {
                if (!(firstMatrix[i][j] == current[j].charAt(0))) {
                    secondMatrix[i][j] = '*';
                } else {
                    secondMatrix[i][j] = current[j].charAt(0);
                }
            }
        }

        for (char[] item : secondMatrix) {
            for (int i = 0; i < item.length; i++) {
                System.out.printf("%c ", item[i]);
            }
            System.out.println();
        }
    }
}