import java.util.Hashtable;

public class App {
    public static void main(String[] args) throws Exception {
        Hashtable<String,Integer> scores = new Hashtable<>();
        scores.put("key1", 95);
        scores.put("key2", 87);
        int keyone = scores.get("key1");//Retrives the score for allice
        System.out.println(keyone);
    }
}
