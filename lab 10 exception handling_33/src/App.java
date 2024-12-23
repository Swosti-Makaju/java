import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
       Scanner scanner=new Scanner(System.in);
       try{
        System.out.println("Enter First Digit:");
        int a=scanner.nextInt();
        System.out.println("Enter Second Digit:");
        int b=scanner.nextInt();
        if(b==0){
            throw new ArithmeticException("Cannot divide by zero.");
        }
        int result=a/b;
        System.out.println(result);
       }
       catch(ArithmeticException e){
        System.err.println("Error:"+ e.getMessage());
       }
       finally{
        System.out.println("Finally block executed");
        scanner.close();
       }
    }
}
