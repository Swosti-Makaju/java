import java.io.File;

public class App {
    public static void main(String[] args) throws Exception {
        String directoryPath="C:\\OOP in java";
        File directory= new File(directoryPath);
        File[] files=directory.listFiles();
        if(files!=null){
            for(File file:files){
                System.out.println(file.getName());
            }
        }
    }
}
