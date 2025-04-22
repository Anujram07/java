public class array {
     
        public static void main(String[] args) {
            int[][] arr = { { 1, 2, 3, 4 }, { 1, 2, 3, 4 } };
            int[] arr1 = new int[arr[0].length];
            int k = 0;
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    // System.out.println(arr[i][j]);
                    arr1[k++] = arr[i][j];
                    
                }
            }
            for (k = 0; k < arr.length; k++) {
                System.out.print(arr1[k] + " ");
            }
        }
    }
