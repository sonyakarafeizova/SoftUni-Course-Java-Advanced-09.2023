package StreamsFilesAndDirectories;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class E4_CountCharacterTypes {
    public static void main(String[] args) {

        String pathInput = "E:\\SoftUni\\Advanced_September.2023\\src\\StreamsFilesAndDirectories\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        //   String pathOutput = "E:\\SoftUni\\Advanced_September.2023\\src\\StreamsFilesAndDirectories\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\output.txt";

        int vowelsCount=0;
        int othersSymbolsCount=0;
        int punctuationsCount=0;
        List<Character> vowels=List.of('a','e','i','o','u');
        List<Character> punctuations=List.of('!',',','.','?');

        try (BufferedReader reader = Files.newBufferedReader(Path.of(pathInput))
        ){
            String line=reader.readLine();
            while(line!=null){
                for (int i = 0; i < line.length(); i++) {
                    char symbol=line.charAt(i);
                    if(vowels.contains(symbol)){
                        vowelsCount++;
                    }else if(punctuations.contains(symbol)){
                        punctuationsCount++;
                    }else if(symbol!=' '){
                        othersSymbolsCount++;
                    }


                }



                line= reader.readLine();
            }

        }catch(IOException e){
            e.printStackTrace();
        }
        System.out.printf("Vowels: %d%n"+
                "Other symbols: %d%n"+
                "Punctuation: %d%n",vowelsCount,othersSymbolsCount,punctuationsCount);

    }
}
