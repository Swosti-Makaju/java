abstract class Utilities{
    abstract void display();
}

public class App {
    public static void main(String[] args) throws Exception {
       Utilities p = new Utilities() {
        void display(){
            System.out.println("Good Morning");
        }
       };
       p.display();
    }
}
