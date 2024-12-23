public class App {
    public static void main(String[] args) throws Exception {
        DerivedClass d = new DerivedClass();

    }
}

class BaseClass {
    public BaseClass() {
        System.out.println("From Base Class Constructor");
    }
}

class DerivedClass extends BaseClass {
    public DerivedClass() {
        super();
        System.out.println("From Derived Class Constructor");
    }
}