import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class App {
    public static void main(String[] args) throws Exception {
       try{
        //read file using BufferInputStream
        //creating fileInputStream object.
        FileInputStream fls=new FileInputStream("input.txt");
        //creating BufferedInputStream object.
        BufferedInputStream bls=new BufferedInputStream(fls);
        int i;
        //read file.
        while((i=bls.read())!=-1){
            System.out.println((char)i);
        }
       }catch(Exception e){
        e.printStackTrace();
       }
    }
}
