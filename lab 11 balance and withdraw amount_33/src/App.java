import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in);
       try{
        System.out.println("Enter your balance: ");
        double balance = scanner.nextDouble();
        System.out.println("Enter withdrawal amount:");
        double withdrawal = scanner.nextDouble();
        //Check if withdrawal amount is valid
        if (withdrawal>balance){
            throw new MyCustomException("Insufficient balance");
        }
        double remBalance = balance - withdrawal;
        System.out.println("Remaining balance:" + remBalance);
       }
catch(MyCustomException ex){
    System.out.println("Error: " + ex.getMessage());
}
catch(Exception ex){
    System.out.println("An error occurred "+ ex.getMessage());
    }finally{
        scanner.close();
    }
    }
}
class MyCustomException extends Exception{
    public MyCustomException(String message){
        super(message);
    }
}
