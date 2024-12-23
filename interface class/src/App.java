interface Utilities{
    public void display();
}
public class App {
    public static void main(String[] args) throws Exception {
       Utilities p=new Utilities() {
         public void display(){
            System.out.println("Good Morning");
         }
       };
       p.display();
       
    }
}
