package SetsAndMapsAdvanced;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public record E2_SetsOfElements() {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int sizeFirstSet = Integer.parseInt(input.split("\\s+")[0]);
        int sizeSecondSet = Integer.parseInt(input.split("\\s+")[1]);

        Set<Integer> firstSet = new LinkedHashSet<>();
        Set<Integer> secondSet = new LinkedHashSet<>();

        //1.napulnim dvata seta
        for (int i = 1; i <= sizeFirstSet; i++) {
            firstSet.add(Integer.parseInt(scanner.nextLine()));

        }
        for (int i = 1; i <= sizeSecondSet; i++) {
            secondSet.add(Integer.parseInt(scanner.nextLine()));
        }

        //namirame obshtitie elementi v dvata seta

        //Set<Integer>duplicateElements=new LinkedHashSet<>();

        //  for (int number: firstSet) {
        //  if(secondSet.contains(number)){
        //    duplicateElements.add(number);
        //   }
        // }
        // duplicateElements.forEach(el-> System.out.print(el+" "));
        firstSet.retainAll(secondSet);//premahva vsichki elementi,koito ne se povtarqt
        for (Integer el : firstSet) {
            System.out.print(el + " ");
        }
    }
}
