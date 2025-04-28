import java.util.Scanner;

public class product {

    public static void product(int n){
        int prod=1;
        for (int i = n; i>1; i--) {
            prod = prod * i;
        }

        System.out.println("product upto "+n+" "+"is"+" "+prod);


    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         System.out.println("Enter  a number a:-");
         int n=in.nextInt();
         product(n);
    }
}
