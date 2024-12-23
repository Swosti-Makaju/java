public class App {
    public static void main(String[] args) throws Exception {
        C obj=new C();
       obj.display();
       obj.show();
    }
}
interface IA{
    void display();
}
interface IB{
    void display();
}
class C implements IA,IB{
    public void show(){
        System.out.println("Show method");
    }
    public void display(){
        System.out.println("Display method");
    }
}