package FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class E4_AppliedArithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> input = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .boxed()
                .collect(Collectors.toList());


        Consumer<List<Integer>> printingResult = e -> System.out.println(e.stream().map(String::valueOf).collect(Collectors.joining(" ")));

        BiFunction<List<Integer>, String, List<Integer>> mutator = (x, y) -> mutateFunction(x, y);
        String command = scanner.nextLine();

        while (!command.equals("end")) {
            if (command.equals("print")) {
                printingResult.accept(input);
            } else {
                input = mutator.apply(input, command);
            }
            command = scanner.nextLine();
        }
    }

    public static List<Integer> mutateFunction(List<Integer> nums, String command) {
        if (command.equals("add")) {
            nums = nums.stream()
                    .map(e -> e = e + 1)
                    .collect(Collectors.toList());
        } else if (command.equals("multiply")) {
            nums = nums.stream()
                    .map(e -> e = e * 2)
                    .collect(Collectors.toList());;
        } else if (command.equals("subtract")) {
            nums = nums.stream()
                    .map(e -> e = e - 1)
                    .collect(Collectors.toList());
        }
        return nums;

    }
}
