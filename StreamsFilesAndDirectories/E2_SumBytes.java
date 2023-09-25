package StreamsFilesAndDirectories;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class E2_SumBytes {
    public static void main(String[] args) {
        String path = "E:\\SoftUni\\Advanced_September.2023\\src\\StreamsFilesAndDirectories\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";

        try (BufferedReader reader = Files.newBufferedReader(Path.of(path))) {
           String read = reader.readLine();
            long sum = 0;
            while (read != null) {
                char[] chars= read.toCharArray();
                for(char c:chars){

                    sum += c;
                }
                read = reader.readLine();

            }
            System.out.println(sum);

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
