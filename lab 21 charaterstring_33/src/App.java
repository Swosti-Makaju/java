import java.io.FileReader;
import java.io.FileWriter;
public class App {
    public static void main(String[] args) throws Exception {
       FileReader in=null;
       FileWriter out=null;
       try{
        in=new FileReader("input.txt");
        out=new FileWriter("output.txt");
        int c;
        while((c=in.read())!=-1){
            out.write(c);
        }
       }finally{
        if(in !=null){
            in.close();
            out.close();
            System.out.println("Complete successfully...");
        }
       }
    }
}