public class App {
    public static void main(String[] args) throws Exception {
        //declaring and initializing 2D array
        int arr[][]={{1,2,3},{2,4,5},{4,4,5}};
        //printing in 2D array
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j]+"");
            }
            System.out.println();
        }
    }
}
