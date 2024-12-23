public class App {
    public static void main(String[] args) throws Exception {
        int a = 10;
        int c = 15;
        c /= a;
        System.out.println("c /= a = " + c);
        c = 15;
        c %= a;
        System.out.println("c %= a =" + c);
        c = 15;
        c &= a;
        System.out.println("c &= a  = " + c);

        c = 15;
        c ^= a;
        System.out.println("c ^= a =" + c);
        c = 15;
        c |= a;
        System.out.println("c |= a =" + c);
    }
}
