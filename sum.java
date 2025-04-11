import java.util.Scanner;

public class sum {
    public static void main(String[] args) 
         {
         System.out.println("ENTER FIRST NUMBER");
           Scanner in =  new Scanner(System.in);
           int a = in.nextInt();
            int sum = 0;

            for(int i=0;i<=a;i++){
                
                System.out.println(sum+"+"+i+"="+(sum=sum+i));
            }
        }
    }

