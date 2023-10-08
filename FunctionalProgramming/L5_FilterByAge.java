package FunctionalProgramming;

import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class L5_FilterByAge {
    public static class Person {
        private final String name;
        private final int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Supplier<Person> personSupplier = () -> {
            String[] input = scanner.nextLine().split(", ");
            return new Person(input[0], Integer.parseInt(input[1]));
        };

        int num = Integer.parseInt(scanner.nextLine());

        List<Person> people = IntStream.range(0, num)
                .mapToObj(ignored -> personSupplier.get())
                .collect(Collectors.toList());

        String conditionParam = scanner.nextLine();
        int ageLimit = Integer.parseInt(scanner.nextLine());
        String[] format = scanner.nextLine().split("\\s+");



        Predicate<Person> filter = getFilter(conditionParam, ageLimit);
        var printer = getPrinter(format);
        people.stream()
                .filter(filter)
                .forEach(printer);

    }
    public static Predicate<Person> getFilter(String conditionParam, int age) {
        return conditionParam.equals("older")
                ? p -> p.age >= age
                : p -> p.age <= age;

    }
    public static Consumer<Person> getPrinter(String[] format) {
        if (format.length == 2) {
            return p -> System.out.println(p.name + " - " + p.age);
        } else if (format[0].equals("name")) {
            return p -> System.out.println(p.name);
        }
        return p -> System.out.println(p.age);
    }
}