package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class E4_BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = scanner.nextInt();//to add
        int s = scanner.nextInt();//to remove
        int x = scanner.nextInt();//check

        ArrayDeque<Integer> queue = new ArrayDeque<>();


        for (int i = 1; i <= n; i++) {
            queue.offer(scanner.nextInt());//dobavqme
        }
        for (int i = 1; i <=s; i++) {
            queue.poll();//premahvame
        }

        if (queue.contains(x)) {
            System.out.println(true);
        } else {
            if(queue.isEmpty()){
                System.out.println(0);
            }else{
                System.out.println(Collections.min(queue));
            }
        }

    }
}
