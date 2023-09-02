package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class L4_MatchingBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String expression=scanner.nextLine();
        ArrayDeque<Integer>openIndex=new ArrayDeque<>();

        for (int i = 0; i <expression.length() ; i++) {
            char current =expression.charAt(i);
            if(current=='('){
                openIndex.push(i);

            }else if(current== ')'){
                int lastOpenIndex=openIndex.pop();
                String subExpression=expression.substring(lastOpenIndex,i+1);
                System.out.println(subExpression);

            }

        }

    }
}
