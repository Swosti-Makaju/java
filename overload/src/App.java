public class App {
    public static void main(String[] args) throws Exception {
     Rectangle rect=new Rectangle();
     System.out.println(rect.Add(2, 3));
     System.out.println(rect.Add(4, 5, 6));
    }
}
class Rectangle{
    public int Add(int x,int y){
        return x+y;
    }
    public int Add(int x,int y,int z){
        return x+y+z;
    }
}