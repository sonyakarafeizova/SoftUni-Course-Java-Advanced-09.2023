package StreamsFilesAndDirectories;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class L6_SortLines {
    public static void main(String[] args) throws IOException {

        Path pathRead= Paths.get("E:\\SoftUni\\Advanced_September.2023\\src\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt");
        Path pathWrite=Paths.get("E:\\SoftUni\\Advanced_September.2023\\src\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams\\outputWriter.txt");
        List<String> allLines= Files.readAllLines(pathRead);
        Collections.sort(allLines);
        Files.write(pathWrite,allLines);


    }
}
