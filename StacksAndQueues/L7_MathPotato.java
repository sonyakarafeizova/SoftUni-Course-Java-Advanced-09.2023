package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Scanner;

public class L7_MathPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = scanner.nextLine().split("\\s+");
        int n = scanner.nextInt();
        PriorityQueue<String> queue = new PriorityQueue<>();
        for (String name : names) {
            queue.offer(name);

        }

        int cycle = 1;
        while (queue.size() > 1) {
            for (int i = 1; i < n; i++) {
                queue.offer(Objects.requireNonNull(queue.poll()));
            }
                if (isPrime(cycle)) {
                    System.out.println("Prime " + queue.peek());

                } else {
                    System.out.println("Removed " + queue.poll());
                }
                cycle++;
            }
            System.out.println("Last is " + queue.poll());
        }

    private static boolean isPrime(int cycle){
        boolean isPrime=true;
        if(cycle<=1){
            return false;
        }
        for (int i = 2; i <=Math.sqrt(cycle) ; i++) {
            if(cycle%i==0){
                isPrime=false;
                break;
            }
        }
        return isPrime;
    }
}
