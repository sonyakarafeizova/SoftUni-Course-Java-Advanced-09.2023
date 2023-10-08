package FunctionalProgramming;

import java.util.Scanner;
import java.util.function.Consumer;

public class E2_KnightsOfHonor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        Consumer<String> printNewLine = name -> System.out.println("Sir "+name);

        for (String str : input) {
            printNewLine.accept(str);
        }

    }
}
