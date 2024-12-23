import java.util.ArrayList;
import java.util.Iterator;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list=new ArrayList<String>(); //creating ArrayList
        list.add("mango");
        list.add("apple");
        list.add("banana");
        list.add("grape");
        //traversing list through iterator
        Iterator<String> itr=list.iterator(); //getting the Iterator
        while(itr.hasNext()){//check if iterator has the lements
        System.out.println(itr.next());//printing the element and move to next 
    }
    }
}
