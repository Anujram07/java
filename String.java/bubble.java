
import java.util.Scanner;

public class bubble {


    public static void bubblesort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]>arr[j+1]){
                   int temp = arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;
                }
            }
        }
        for (int i:arr) {
            System.out.println("sorted array :-"+i);
            
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of Array:-");
        int n=in.nextInt();
        int[] arr=new int[n];
        System.out.println("enter value of unsorted array:-");
        for(int i=0;i<n;i++)
        {
         arr[i]=in.nextInt();
        }
        bubblesort(arr);

    }
}
