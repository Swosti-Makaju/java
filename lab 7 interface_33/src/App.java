

public class App {
    public static void main(String[] args) throws Exception {
      Circle circle=new Circle();
       circle.draw();
      Rectangle rectangle=new Rectangle();
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

class Rectangle implements Drawable{
    public void draw(){
        System.out.println("Drawing Rectangle");
    }
}