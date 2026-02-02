public class transposeOfMatrix {
    public static void main(String[] args) {
        int[][] arr = {{2,3,4}, {7,8,9}, {1,11,12}};
        for(int i = 1; i<arr.length; i++){
            for(int j = 0; j<=i; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        for(int[] ele: arr){
            for(int x: ele){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}
