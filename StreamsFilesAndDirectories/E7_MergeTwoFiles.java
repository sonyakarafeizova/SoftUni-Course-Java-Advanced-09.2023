package StreamsFilesAndDirectories;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class E7_MergeTwoFiles {
    public static void main(String[] args) throws IOException {
        String path1 = "E:\\SoftUni\\Advanced_September.2023\\src\\StreamsFilesAndDirectories\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputOne.txt";
        String path2 = "E:\\SoftUni\\Advanced_September.2023\\src\\StreamsFilesAndDirectories\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputTwo.txt";

        PrintWriter writer = new PrintWriter("outputMerge.txt");

        List<String> allLinesFileOne = Files.readAllLines(Path.of(path1));
        allLinesFileOne.forEach(line -> writer.println(line));
        List<String> allLinesFileTwo = Files.readAllLines(Path.of(path2));
        allLinesFileTwo.forEach(line -> writer.println(line));

        writer.close();


    }
}