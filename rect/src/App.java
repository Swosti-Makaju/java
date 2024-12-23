public class App {
    public static void main(String[] args) throws Exception {
         Rectangle rect=new Rectangle(4, 5);
         rect.Display();
    }
   }
   class Rectangle 
   {
         int first=0;
         int second=0;
         public Rectangle(int a,int b)
         {
               first=a;
               second=b;
         }
         public void Display()
         {
               System.out.println(first+second);
         }
   }