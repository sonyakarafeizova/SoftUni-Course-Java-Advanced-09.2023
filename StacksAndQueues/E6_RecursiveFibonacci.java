package StacksAndQueues;

import java.util.Scanner;

public class E6_RecursiveFibonacci {
    private static long[]memory;//masiv, v koito pazim ednakvite izchisleni stoinost
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        memory=new long [n+1];

        long result = fib(n);
        System.out.println(result);
    }

    private static long fib(int n) {

        if(n<2){
            return 1;//uslovie za duno na rekursiqta
        }
        if(memory[n]!=0){//izpolzvame zapazenite chisla na fibonachi
            return memory[n];
        }
        memory[n]=fib(n - 1) + fib(n - 2);

        return memory[n];
    }
}

