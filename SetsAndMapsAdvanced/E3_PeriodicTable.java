package SetsAndMapsAdvanced;

import java.util.*;

public class E3_PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> uniqueElements=new TreeSet<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int row = 1; row <= n; row++) {
            String[] chemicalElements = scanner.nextLine().split("\\s+");
           // Collections.addAll(Arrays.asList(chemicalElements),uniqueElements);

            uniqueElements.addAll(Arrays.asList(chemicalElements));
        }
         uniqueElements.forEach(el-> System.out.print(el+" "));

    }
}
