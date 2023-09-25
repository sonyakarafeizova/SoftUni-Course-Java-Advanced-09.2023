package StreamsFilesAndDirectories;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class E5_LineNumbers {
    public static void main(String[] args) {

        String pathInput = "E:\\SoftUni\\Advanced_September.2023\\src\\StreamsFilesAndDirectories\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        String pathOutput = "E:\\SoftUni\\Advanced_September.2023\\src\\StreamsFilesAndDirectories\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\output.txt";

        try (
                BufferedReader reader = Files.newBufferedReader(Path.of(pathInput));
                BufferedWriter writer = Files.newBufferedWriter(Path.of(pathOutput))
        ) {

            String line = reader.readLine();
            int count = 1;
            while (line != null) {
                writer.write(count + ". " + line);
                writer.write(System.lineSeparator());

                count++;
                line = reader.readLine();
            }


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
