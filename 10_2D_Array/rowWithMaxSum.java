public class rowWithMaxSum {
    public static void main(String[] args) {
        int[][] arr = {{2,23,5,2}, {8,39,83,37}, {2,234,2,5}};
        int maxsum = Integer.MIN_VALUE;
        int rowno = -1;
        for(int i = 0; i<3; i++){
            int sum = 0;
            for(int j = 0; j<4; j++){
                sum += arr[i][j];
            }
            if(sum>maxsum){
                maxsum = sum;
                rowno = i+1;
            }
        }
        System.out.println(rowno);
    }    
}
