package SetsAndMapsAdvanced;

import java.util.*;

public class L6_AverageStudentsGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<Double>> grades = new TreeMap<>();

        int lines = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < lines; i++) {
            String[] studentData = scanner.nextLine().split(" ");
            String studentName = studentData[0];
            double studentGrade = Double.parseDouble(studentData[1]);
            grades.putIfAbsent(studentName, new ArrayList<>());
            List<Double> studentGrades = grades.get(studentName);
            studentGrades.add(studentGrade);
        }
        grades.forEach((key, value) -> {
            System.out.printf("%s -> ", key);
            value.forEach(e -> System.out.printf("%.2f ", e));

            System.out.printf("(avg: %.2f)%n", value.stream().mapToDouble(Double::doubleValue).average().getAsDouble());
        });

    }
}