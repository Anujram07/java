public class palindrome {
    public static void main(String[] args) {
        String str ="mam";
        String rev = "";
        for (int i = str.length(); i>0; i++) {
            rev = rev + str.charAt(i);
        }

        if(str==rev){
            System.out.println("palindrome");
        }

        else{
            System.out.println("not palindrome");
        }
    }
}
