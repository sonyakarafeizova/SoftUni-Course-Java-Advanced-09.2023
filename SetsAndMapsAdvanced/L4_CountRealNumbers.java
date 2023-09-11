package SetsAndMapsAdvanced;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class L4_CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] values = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToDouble(Double::parseDouble)
                .toArray();

        Map<Double, Integer> valuesWithOccurrences = new LinkedHashMap<>();

        for (double value : values) {
            valuesWithOccurrences.putIfAbsent(value, 0);
            valuesWithOccurrences.put(value, valuesWithOccurrences.get(value)+1);
        }

        valuesWithOccurrences.forEach((key, value) -> System.out.printf("%.1f -> %d%n", key, value));
    }
}
