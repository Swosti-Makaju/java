public class App {
    public static void main(String[] args) throws Exception {
        Rectangle rect=new Rectangle();
        System.out.println("Value before changing:"+rect.a);
        rect.Display(rect);
        System.out.println("Value after changing:"+rect.a);
    }
}
 class Rectangle{
    public int a=100;
    public void Display(Rectangle rect)
    {
        rect.a=rect.a+100;
    }
 }