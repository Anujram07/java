/*2d to 1d array */

public class array4 {
    public static void main(String[] args) {
        int[][] arr={{1,2,3,4},{5,6,7,8}};
        int totalc=0;
        for (int i = 0; i < arr.length; i++) {
            totalc=totalc+arr[i].length
            System.out.println(arr[i].length);
        int[] arr1=new int[totalc];
        int k=0;          
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr1[k]=arr[i][j];
                k++;
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }                  
       
    }
}
