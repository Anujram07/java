import java.util.Scanner;

public class linearsearch {
    public static void  linearsearch(int arr[],int target){
      for(int i=0;i<arr.length;i++){
           if(arr[i]==target){
            System.out.println(i+1);
           }
           
           }
        }
         public static void main(String[] args) {
          {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of Array:-");
        int n=in.nextInt();
        int[] arr=new int[n];
        System.out.println("enter value of array:-");
        for(int i=0;i<n;i++)
        {
         arr[i]=in.nextInt();
        }

        System.out.println("enter number to be searched:-");
        int target = in.nextInt();
        linearsearch(arr, target);
    }
    }
}
