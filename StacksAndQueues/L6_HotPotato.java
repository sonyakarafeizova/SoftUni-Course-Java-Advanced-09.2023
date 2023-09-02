package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class L6_HotPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = scanner.nextLine().split("\\s+");
        int n = scanner.nextInt();
        ArrayDeque<String> queue = new ArrayDeque<>();

        for (String name : names) {
            queue.offer(name);

        }

        while (queue.size() > 1) {

            for (int i = 1; i < n; i++) {
                String move = queue.poll();
                queue.offer(move);

            }
            System.out.println("Removed " + queue.poll());
        }
        System.out.println("Last is " + queue.poll());
    }
}
