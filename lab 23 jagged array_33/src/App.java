public class App {
    public static void main(String[] args) throws Exception {
        int[][] matrix=new int[][]{{1,2,3},{4,5,6,7},{8,9}};
        for(int i=0;i<matrix.length;i++) //row
        {
            int sum=0; //variable to store sum of elements in each row
            for (int j=0;j<matrix[i].length;j++)//column
            {
                System.out.print(matrix[i][j]+"");
                sum+=matrix[i][j]; //add the current element to the sum
            }
            System.out.println("Sum of row"+(i+1)+":"+sum);//print sum of the current row
        }
    }
}
