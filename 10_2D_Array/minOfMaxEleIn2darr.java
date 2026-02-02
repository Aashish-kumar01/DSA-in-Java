import java.util.Scanner;
public class minOfMaxEleIn2darr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<3; i++){
            int max = Integer.MIN_VALUE;
            for(int j = 0; j<3; j++){
                if(arr[i][j] > max){
                    max = arr[i][j];
                }
            }
            if(max<min){
                min = max;
            }
        }
        System.out.println(min);

        sc.close();
    }    
}
