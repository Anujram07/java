public class repeat{
    public static void main(String[] args) {
        String str="priyanshu sahu";
        char[] arr=str.toCharArray();
    
    
        for (int i = 0; i <arr.length; i++) {
           for(int j=i+1;j<arr.length;j++){
            if(arr[j]==arr[i]){
               System.out.println(arr[i]);
            }
           }
        }
    
    }
    
}
