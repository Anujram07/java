public class maxsubarray {
   public static void  main(String[] args){
    int [] arr = {1,56,2,4,-2,8,-1};
    int currentsum = 0; int maxsum = 0;
    for(int i = 0;i<arr.length;i++){
        currentsum += arr[i];
        if(maxsum<currentsum){
            maxsum = currentsum;
        }

        if(currentsum<0){
            currentsum = 0;
        }
        
      }
      try{
        System.out.print(maxsum);
      }catch(IndexOutOfBoundsException e){
        System.out.print("rehne do.........");
      }
      
   }

   
}
