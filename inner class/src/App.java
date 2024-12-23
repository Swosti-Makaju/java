public class App {
    public static void main(String[] args) throws Exception {
        Outer.Inner in = new Outer().new Inner();
        in.show();
    }
}
class Outer{
    class Inner{
        public void show()
            {
                System.out.println("In a nested class method");
            }
    }
}