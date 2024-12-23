public class Sum {
       public static void main(String[] args) throws Exception {
            int[] intarr=new int[]{1,2,3,4,5,6};   
            int totalitem=intarr.length;  
            int sum=0;    
         for (int i:intarr){
            sum+=i;
            System.out.println(i);
            }
            System.out.println("Sum:"+sum);
            System.out.println("Average:"+(sum/totalitem));
            }
      }

