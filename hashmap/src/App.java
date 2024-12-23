import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        //create a hashmap with integer keys and string values
        Map<Integer,String> studentMap=new HashMap<>();
        //adding key-value pairs to the map
        studentMap.put(101, "Nepal");
        studentMap.put(102, "China");
        studentMap.put(103, "India");
        studentMap.put(104, "Pakistan");//duplicate values are allowed 
        //display the contents of the map
        System.out.println("Map contains:");
        for(Map.Entry<Integer,String>entry:studentMap.entrySet()){
            System.out.println("Key:" + entry.getKey()+",value:" +entry.getValue());
        }
        //check if a key exists in the map\
        boolean containsKey=studentMap.containsKey(102);
        System.out.println("Contains key 102:" + containsKey);
        //check if a value exists in the map
        boolean containsValue=studentMap.containsKey("China");
        System.out.println("Contains value 'China':" + containsValue);
        //get the value associated with specific key
        String valueforKey=studentMap.get(101);
        System.out.println("Value for key 101:" + valueforKey);
        //remove a key-value pair from the map
        String removedValue=studentMap.remove(103);
        System.out.println("Removed value for key 103:" + removedValue);
        //clear the map
        studentMap.clear();
        System.out.println("Cleared the map");
    }
}
