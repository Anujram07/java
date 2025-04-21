/*2d to 1d array */

public class array4 {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}};
        
        // Calculate the total number of elements in the 2D array
        int totalElements = 0;
        for (int i = 0; i < arr.length; i++) {
            totalElements += arr[i].length;
        }
        
        // Create a 1D array with the correct size
        int[] arr1 = new int[totalElements];
        
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr1[k++] = arr[i][j];
            }
        }
        
        // Print the 1D array
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
    }
}