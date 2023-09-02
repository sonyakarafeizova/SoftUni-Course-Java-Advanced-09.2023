package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class E7_SimpleTextEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        ArrayDeque<String> commands = new ArrayDeque<>();
        ArrayDeque<String> removedElements = new ArrayDeque<>();
        StringBuilder text = new StringBuilder();

        for (int i = 0; i < n; i++) {
            String rawCommand = scanner.nextLine();
            String[] commandsArgs = rawCommand.split("\\s+");

            switch (commandsArgs[0]) {
                case "1":
                    commands.push(rawCommand);
                    add(text, commandsArgs[1]);
                    break;
                case "2":
                    int count = Integer.parseInt(commandsArgs[1]);
                    commands.push(rawCommand);
                    saveDeletedElements(text, count, removedElements);
                    delete(text, count);
                    break;
                case "3":
                    int index = Integer.parseInt(commandsArgs[1]);
                    System.out.printf("%s%n", text.charAt(index - 1));
                    break;
                case "4":
                    String lastCommand = commands.pop();
                    String[] lastComArgs = lastCommand.split("\\s+");
                    String lastCommandType = lastComArgs[0];
                    if (lastCommandType.equals("1")) {
                        int numberOfElementsToDelete = lastComArgs[1].length();
                        delete(text, numberOfElementsToDelete);
                    } else {
                        add(text, removedElements.pop());
                    }
                    break;

            }
        }
    }

    private static void saveDeletedElements(StringBuilder text, int count, ArrayDeque<String> removedElements) {
        StringBuilder sb = new StringBuilder();
        for (int i = text.length() - count; i < text.length(); i++) {
            sb.append(text.charAt(i));

        }
        removedElements.push(sb.toString());
    }

    private static void delete(StringBuilder text, int count) {
        int textLength = text.length();
        for (int i = 1; i <=count; i++) {
            text.deleteCharAt(textLength-i);

        }
    }

    private static void add(StringBuilder text, String commandsArg) {
        text.append(commandsArg);
    }
}
