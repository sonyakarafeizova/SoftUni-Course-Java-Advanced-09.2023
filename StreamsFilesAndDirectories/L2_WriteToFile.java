package StreamsFilesAndDirectories;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class L2_WriteToFile {
    public static void main(String[] args) throws IOException {
        String pathRead = "E:\\SoftUni\\Advanced_September.2023\\src\\" +
                "04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";

        String pathWrite = "E:\\SoftUni\\Advanced_September.2023\\src\\" +
                "04. Java-Advanced-Files-and-Streams-Lab-Resources\\outputTask2";

        FileInputStream inputStream = new FileInputStream(pathRead);
        FileOutputStream outputStream = new FileOutputStream(pathWrite);

        int currentByte = inputStream.read();

        while (currentByte >= 0) {
            char currentSymbol = (char) currentByte;
            if (currentSymbol != '.' && currentSymbol != ',' && currentSymbol != '!' && currentSymbol != '?') {
                outputStream.write(currentByte);
            }
            currentByte=inputStream.read();
        }

        inputStream.close();
        outputStream.close();
    }
}
