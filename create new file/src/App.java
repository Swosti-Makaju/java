import java.io.File;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws Exception {
       File file=new File("newfile.txt");
       try{
        file.createNewFile();
       }catch(IOException e)
       {
        System.out.println("An error occured:");
       }
    }
}
