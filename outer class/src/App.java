public class App {
    public static void main(String[] args) throws Exception {
       Outer.Inner.display();
    }
}
class Outer{
    static class Inner{
        public static void display(){
            System.out.println("Inside inner class method");
        }
    }
}