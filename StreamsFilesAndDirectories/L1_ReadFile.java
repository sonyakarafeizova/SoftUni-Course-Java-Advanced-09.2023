package StreamsFilesAndDirectories;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class L1_ReadFile {
    public static void main(String[] args) throws IOException {
        String path = "E:\\SoftUni\\Advanced_September.2023\\src\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        FileInputStream inputStream = new FileInputStream(path);

        int currentByte = inputStream.read();
        while (currentByte >= 0) {

            System.out.print(Integer.toBinaryString(currentByte) + " ");
            currentByte = inputStream.read();
        }
        inputStream.close();

    }
}
