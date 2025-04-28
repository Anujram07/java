
import java.util.Scanner;

public class sumnatural {


    public static void sumnatural(int n){
        int sum = 0;
        for(int i=0;i<=n;i++){
         sum = sum + i;
        }
        System.out.println("sum="+sum);
    }







    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter  a number:-");
        int n=in.nextInt();
       // System.out.println(n);
          sumnatural(n);
    }
}
