package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class E8_InfixToPostfix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        ArrayDeque<String> operators = new ArrayDeque<>();

        for (int i = 0; i < input.length; i++) {
            String current = input[i];
            switch (current) {

                case "+":
                case "-":
                case "*":
                case "/":
                case "^":
                case "(":
                    if (operators.isEmpty() || hasLowerPrecedence(operators.peek(), current)) {
                        operators.push(current);
                    } else {
                        while (!hasLowerPrecedence(operators.peek(), current)) {
                            System.out.print(operators.pop() + " ");
                            if (operators.isEmpty()) {
                                break;
                            }
                        }
                        operators.push(current);
                    }
                    break;
                case ")":
                    while (!operators.peek().equals("(")) {
                        System.out.print(operators.pop() + " ");
                    }
                    operators.pop();
                    break;
                default:
                    System.out.print(current + " ");
            }
        }
        while (!operators.isEmpty()) {
            System.out.print(operators.pop() + " ");
        }
    }

    private static boolean hasLowerPrecedence(String current, String next) {
        int currentOperatorPrecedence = precedence(current);
        int nextOperatorPrecedence = precedence(next);
        if (currentOperatorPrecedence < nextOperatorPrecedence) {
            return true;
        } else if (currentOperatorPrecedence == nextOperatorPrecedence) {
            if (currentOperatorPrecedence == 3 || currentOperatorPrecedence == 4) {
                return true;
            } else {
                return false;
            }
        } else {
            if (currentOperatorPrecedence == 4) {
                return true;
            } else {
                return false;
            }
        }
    }

    private static int precedence(String operator) {
        int precedence = 0;
        if (operator.equals("+") || operator.equals("-")) {
            precedence = 1;
        } else if (operator.equals("*") || operator.equals("/")) {
            precedence = 2;
        } else if (operator.equals("^")) {
            precedence = 3;
        } else if (operator.equals("(")) {
            precedence = 4;
        }
        return precedence;
    }
}
