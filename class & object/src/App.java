public class App {
    public static void main(String[] args) throws Exception {
      Calculation cal=new Calculation();
      int sum=cal.Add(2, 3);
      int sub=cal.Sub(4,2 );
      System.out.println(sum);
      System.out.println(sub);  
    }
}
class Calculation 
{
    public int Add(int x, int y)
    {
        return x+y;
    }
    public int Sub(int x, int y)
    {
        return x-y;
    }
}
