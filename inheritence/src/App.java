public class App {
    public static void main(String[] args) throws Exception {
        C obj=new C();
        obj.MethodA();
        obj.MethodC();

        B obj1=new B();
        obj1.MethodA();
        obj1.MethodB();
    }
}
class A{
    public void MethodA(){
        System.out.println("I am methodA");
    }
}
class B extends A{
    public void MethodB(){
        System.out.println("I am methodB");
    }
}
class C extends A{
    public void MethodC(){
        System.out.println("I am methodC");
    }
}