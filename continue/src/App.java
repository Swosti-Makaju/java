public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("The odd numbers between 1 to 10 are: ");
        for(int number = 1; number <= 10; number ++)
        {
            if(number %2 == 0) continue;
            System.out.println(number);
        }
    }
}
