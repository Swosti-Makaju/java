public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(search(3));
        System.out.println(search(10));
    }
    public static String search(int key){
        int[] numbers = {1,2,3,4,5,6,7,8,9};
        for(int element:numbers){
            if(element==key){
                return "success";
            }
        }
        return "failure";
    }
}
