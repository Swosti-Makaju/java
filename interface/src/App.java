public class App {
    public static void main(String[] args) throws Exception {
       Drawable circle=new Circle();
       circle.draw();
       Drawable rectangle=new Recatngle();
       rectangle.draw();
    }
}
interface Drawable{
    void draw();
}
class Circle implements Drawable{
    public void draw(){
        System.out.println("Drawing Circle");
    }
}
class Recatngle implements Drawable{
    public void draw(){
        System.out.println("Drawing Recatngle");
    }
}