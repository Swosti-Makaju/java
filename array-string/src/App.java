import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
       //create an arraylist of integers
       List<Integer>numbers=new ArrayList<>();
       //adding elements to the arraylist
       numbers.add(10);
       numbers.add(20);
       numbers.add(30);
       numbers.add(40);
      //accessing elements by index
      int firstNumber=numbers.get(0);
      System.out.println("First number:" + firstNumber);
     //iterating through the arraylist
      System.out.println("All numbers:");
      for(int number:numbers){
        System.out.println(number);
      }
      //checking if an element exists in the array list
      boolean contains30=numbers.contains(30);
      System.out.println("contains 30:" + contains30);
     // removing an element from the arraylist
     boolean removed20=numbers.remove(Integer.valueOf(20)); //removing by value
     System.out.println("Removed 20:" + removed20);

     //clear the arraylist
     numbers.clear();
     System.out.println("Clear the ArrayList");
    }
}
