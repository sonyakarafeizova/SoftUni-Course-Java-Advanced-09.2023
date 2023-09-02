package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class E3_MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> stack=new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            String []tokens=scanner.nextLine().split(" ");
            switch(tokens[0]){
                case"1":
                    stack.push(Integer.parseInt(tokens[1]));//add
                    break;
                case"2":
                    stack.pop();//delete
                    break;
                case"3":
                    System.out.println(Collections.max(stack));//max element
                    break;
            }
        }
    }
}
