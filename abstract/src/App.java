public class App {
    public static void main(String[] args) throws Exception {
        Shape Shape =new Circle();
        Shape.draw();
        Shape Shape1=new Rectangle();
        Shape1.draw();
    }
}
abstract class Shape {
abstract void draw();
}
class Circle extends Shape{
    void draw(){
        System.out.println("Drawing Circle");
    }
}
class Rectangle extends Shape {
    void draw(){
        System.out.println("Drawing rectangle");
    }
}
