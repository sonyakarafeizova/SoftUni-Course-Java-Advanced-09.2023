package FunctionalProgramming;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;

public class L3_CountUppercaseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] textAsList = scanner.nextLine().split(" ");

        Predicate<String> checkerUpperCase = word -> Character.isUpperCase(word.charAt(0));
        ArrayList<String> result=new ArrayList<>();

        for (int i = 0; i < textAsList.length; i++) {
            if(checkerUpperCase.test(textAsList[i])){
                result.add(textAsList[i]);
            }
        }
        System.out.println(result.size());

        for(String word:result){
            System.out.println(word);
        }

    }
}
