
import java.util.Scanner;

public class smarray {
               static int  smallest(){
                Scanner in = new Scanner(System.in);
               System.out.println("Enter size of Array:");
               int n=in.nextInt();
               int[] arr=new int[n];
               System.out.println("enter value of array");
               for(int i=0;i<n;i++)
               {
                arr[i]=in.nextInt();
               }
               
               for(int k=0;k<arr.length;k++){
                System.out.print(arr[k]);
               }


               int sum = 0;
               for(int j=0;j<arr.length;j++){
                sum=sum+arr[j];
               }
               System.out.println(sum);
            return sum;
            }
    



    
              

        public static void main(String[] args) {
            smarray obj = new smarray();
           // System.out.println(variable.a);
            System.out.print(obj.smallest());
    }

}