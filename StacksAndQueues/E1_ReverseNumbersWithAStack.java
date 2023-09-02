package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class E1_ReverseNumbersWithAStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] n = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int number : n) {
            stack.push(number);//obhojdame masiva i na vsqka operaciq go pushvame v stack
        }

        while (!stack.isEmpty()) {
            int num = stack.pop();
            System.out.print(num+" ");
        }

    }
}
