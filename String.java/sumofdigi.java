public class sumofdigi {

    public static void sumdigi(int a){
        int sum = 0;
        while( a!=0){
        int digit = a%10;
        sum = sum + digit;
        a = a/10;
        }
        System.out.println(sum);
        }
    
        public static void main(String[] args) {
            int a = 5;
            sumdigi(a);
        }

    }