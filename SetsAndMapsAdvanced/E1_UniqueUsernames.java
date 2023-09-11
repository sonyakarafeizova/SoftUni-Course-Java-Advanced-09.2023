package SetsAndMapsAdvanced;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class E1_UniqueUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> usernames=new LinkedHashSet<>();

        int countUserNames=Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <=countUserNames; i++) {
            String username=scanner.nextLine();
            usernames.add(username);
        }

        usernames.forEach(System.out::println);

    }
}
