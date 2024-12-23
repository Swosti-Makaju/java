import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first digit:");
        int a = sc.nextInt();
        System.out.println("Enter second digit:");
        int b = sc.nextInt();
        System.out.println("Enter 1 for Add:");
        System.out.println("Enter 2 for Sub:");
        System.out.println("Enter 3 for Mul:");
        System.out.println("Enter 4 for Div:");
        int option = sc.nextInt();
        Calculation obj = new Calculation();
        switch (option) {
            case 1:
                int c = obj.Add(a, b);
                System.out.println(c);
                break;
            case 2:
                int d = obj.Sub(a, b);
                System.out.println(d);
                break;
            case 3:
                int e = obj.Mul(a, b);
                System.out.println(e);
                break;
            case 4:
                int f = obj.Div(a, b);
                System.out.println(f);
                break;
        }
        sc.close(); }
}

class Calculation {
    public int Add(int a, int b)

    {
        return a + b;
    }

    public int Sub(int a, int b)

    {
        return a - b;
    }

    public int Mul(int a, int b)

    {
        return a * b;
    }

    public int Div(int a, int b)

    {
        return a / b;
    }
}
