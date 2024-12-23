public class App {
    public static void main(String[] args) throws Exception {
       //Using wrapper classes to convert primitive types to objects
       Integer intValue = Integer.valueOf(42);
       Double doubleValue = Double.valueOf(3.14);
       //Using autoboxing to automatically convert primitives to objects
       Character charValue='A';
       Boolean boolValue=true;
       //Unboxing to convert objects back to primitive types
       int intValuePrimitive = intValue.intValue();
       double doubleValuePrimitive=doubleValue.doubleValue();
       //Automating
       char charValuePrimitive=charValue;
       Boolean boolValuePrimitive = boolValue;
       System.out.println("intValue: "+intValue);
       System.out.println("doubleValue: " +doubleValue);
       System.out.println("charValue: " +charValue);
       System.out.println("boolValue: " +boolValue);
    }
}
