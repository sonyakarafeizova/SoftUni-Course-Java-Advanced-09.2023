package StreamsFilesAndDirectories;

import java.io.File;

public class E8_GetFolderSize {
    public static void main(String[] args) {

        String path = "E:\\SoftUni\\Advanced_September.2023\\src\\StreamsFilesAndDirectories\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources";

        File directory = new File(path);
        long size = 0;
        if (directory.exists()) {
            if (directory.isDirectory()) {
                File[] files = directory.listFiles();
                for (File file : files) {
                    if (!file.isDirectory()) {
                        size += file.length();
                    }
                }
            }
        }
        System.out.printf("Folder size: %d",size);
    }
}