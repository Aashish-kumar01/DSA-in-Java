public class reverseInRows {
    public static void main(String[] args) {
        int[][] arr = {{2,3,4,5}, {7,8,9,10}, {1,11,12,13}};
        // Reverse the rows of the matrix
        for(int i = 0; i<arr.length; i++){
                int j = 0;
                int k = arr[0].length-1;
                while(j<=k){
                int temp = arr[i][j];
                arr[i][j] = arr[i][k];
                arr[i][k] = temp;
                k--;
                j++;
                }
        }
        // Reverse the column of the matrix
        for(int j = 0; j<arr[0].length; j++){
            int i = 0; 
            int k = arr.length-1;
            while(i<=k){
                int temp = arr[i][j];
                arr[i][j] = arr[k][j];
                arr[k][j] = temp;
                k--;
                i++;
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
