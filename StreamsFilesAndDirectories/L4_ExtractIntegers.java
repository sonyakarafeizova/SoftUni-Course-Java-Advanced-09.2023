package StreamsFilesAndDirectories;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class L4_ExtractIntegers {
    public static void main(String[] args) throws FileNotFoundException {

        String pathRead="E:\\SoftUni\\Advanced_September.2023\\src\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        FileInputStream inputStream=new FileInputStream(pathRead);
        Scanner scanner = new Scanner(inputStream);

        while(scanner.hasNext()){
            if(scanner.hasNextInt()){
                int number= scanner.nextInt();
                System.out.println(number);
            }
            scanner.next();
        }


    }
}
