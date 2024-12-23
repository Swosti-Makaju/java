import java.io.*;
import java.nio.file.*;


public class App {
    public static void main(String[] args) throws Exception {
        String sourceFilePath="C:\\OOP in java\\example.txt";
        String destinationFilePath="C:\\OOP in java\\SWITCH\\example.txt";
        Path sourcePath=Paths.get(sourceFilePath);
        Path destinationPath=Paths.get(destinationFilePath);
        try{
            Files.copy(sourcePath,destinationPath);
            System.out.println("File copied successfully!");
        }catch(IOException e){
            System.out.println("An error occurred:"+e.getMessage());
        }
    }
}