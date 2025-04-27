public class summ2darray {
    public static void main(String[] args) {
        int [][] arr={{1,2},{4,5}};
        int sum=0;

        for (int i = 0; i <=arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                sum+=arr[i][j];
                 }
            System.out.println(sum);
        }
    }
}
