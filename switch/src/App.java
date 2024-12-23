public class App {
    public static void main(String[] args) throws Exception {
        String browser = "chrome";
        switch (browser) {
            case "safari":
                System.out.println("The browser is safari");
                break;
            case "edge":
            System.out.println("The browser is edge");
            break;
            case "chrome":
            System.out.println("The browser is chrome");
            break;
            default:
            System.out.println("The browser is not supported.");
        }
    }
}
