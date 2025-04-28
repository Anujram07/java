public class binarysearch {
    public static int  binarysearch(int arr[],int target){
            int start=0;
            int end = arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;

            if(arr[mid]==target){
                return mid;
            }

            else if(arr[mid]>target){
                end=mid-1;
            }   
            
            else{
                start= mid+1;
           }
        
        }
        return -1;

    }



    public static void main(String[] args) {
        int arr[] = {1,5,9,24,55,77};
        int target = 55;
        binarysearch(arr, target);
    }
}

