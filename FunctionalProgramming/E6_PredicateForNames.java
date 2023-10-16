package FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class E6_PredicateForNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        String[] names = scanner.nextLine().split("\\s+");

        Predicate<String> predicate = e -> e.length() <= length;
        System.out.println(Arrays.stream(names)
                .filter(predicate)
                .collect(Collectors.joining(System.lineSeparator())));

    }
}
