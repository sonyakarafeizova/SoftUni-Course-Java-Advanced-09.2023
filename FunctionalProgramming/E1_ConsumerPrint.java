package FunctionalProgramming;

import java.util.Scanner;
import java.util.function.Consumer;

public class E1_ConsumerPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");

        Consumer<String> printNewLine = str -> System.out.println(str);

        for (String str : input) {
            printNewLine.accept(str);
        }
    }
}
