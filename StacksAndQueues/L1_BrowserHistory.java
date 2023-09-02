package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class L1_BrowserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> history = new ArrayDeque<>();
        String navigation = scanner.nextLine();
        String current = "";
        while (!navigation.equals("Home")) {

            if (navigation.equals("back")) {
                if (!history.isEmpty()) {

                    current = history.pop();
                } else {
                    System.out.println("no previous URLs");
                    navigation = scanner.nextLine();
                    continue;
                }
            } else {
                if (!current.isEmpty()) {
                    history.push(current);
                }
                current = navigation;
            }
            System.out.println(current);

            navigation = scanner.nextLine();

        }
    }
}
