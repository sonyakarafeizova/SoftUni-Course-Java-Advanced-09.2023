package SetsAndMapsAdvanced;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class L1_ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> cars = new LinkedHashSet<>();

        while (true) {
            String inputCars = scanner.nextLine();

            if (inputCars.equals("END")) {
                break;
            }

            String[] input = inputCars.split(", ");
            String direction = input[0];
            String carNumber = input[1];

            if (direction.equals("IN")) {
                cars.add(carNumber);
            } else {
                cars.remove(carNumber);
            }
        }

        String output = cars.isEmpty()
                ? "Parking Lot is Empty"
                : cars.stream()
                .collect(Collectors
                        .joining(System.lineSeparator()));

        System.out.println(output);
    }
}