import java.util.Scanner;

public class even {
    public static void even(int a,int b){
      for (int i=a; i<=b; i++){
            if(i%2==0){
                System.out.println("even="+i);
            }
      }
     
    }


    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         System.out.println("Enter  a number a:-");
        int a=in.nextInt();
        System.out.println("Enter  a number b:-");
        int b=in.nextInt();
        even(a,b);
}
}