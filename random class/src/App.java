import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
       //creating an instance of random calss
       Random rand = new Random();
       //generating random integers in range 0 to 99
       int int1 = rand.nextInt(100);
       double dub1 = rand.nextDouble();//range 0 to 1
       System.out.println(int1);
       System.out.println(dub1);
    }
}
