public class maxdigit {

    static int max_digit(int a ){
        int max = 0;
        int digit = 0;
        while (a>0){
            digit = a%10;
            if (digit > max)
                max = digit;
            a/=10;    
        }
        return max;
    }
    

    
    public static void main(String[] args) {
        int output=max_digit(223);
        System.out.println(output);
    }

    }