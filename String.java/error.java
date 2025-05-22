import java.util.Scanner;

public class error {
    public static void main(String[] args) {
       // int a = 5; int b = 0;
         Scanner in = new Scanner(System.in);
         System.out.println("Enter a number");
         int a =in.nextInt();
         int b =in.nextInt();
        try{
            int c = a/b;
            System.out.println(c);
        } catch(Exception e){
            System.out.println("Cannot divisible by 0 ");
        }
        finally{
            System.out.println("chala jaa ........");
        }
    }
}
