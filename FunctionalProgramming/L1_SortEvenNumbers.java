package FunctionalProgramming;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class L1_SortEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                        .split(", "))
                .map(Integer::parseInt)
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());


        printListWithComa(numbers);
        Collections.sort(numbers);

        printListWithComa(numbers);
    }

    private static void printListWithComa(List<Integer> numbers) {
        List<String> numbersAsText = new ArrayList<>();
        for (int number : numbers) {
            //4 -> "4"
            numbersAsText.add(String.valueOf(number));
        }

        System.out.println(String.join(", ", numbersAsText));
    }
}
