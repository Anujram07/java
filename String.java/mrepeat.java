public class mrepeat {
    public static void main(String[] args) {
        String str="hello";
        char[] arr=str.toCharArray();
        int count=0;
        int max=0;
    
    
        for (int i = 0; i <arr.length; i++) {
           for(int j=i+1;j<arr.length;j++){
            if(arr[j]==arr[i]){
                count++;
               //System.out.println(arr[i]);
            }
            System.out.print(count);
           }
           //System.out.print(count);
        }
    
    }
}