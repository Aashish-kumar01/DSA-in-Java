import java.util.Scanner;
public class inputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][4];
        System.out.println(arr.length+" "+arr[0].length);
        // taking input in 2d array
        for(int i = 0; i<3; i++){
            for(int j = 0; j<4; j++){
                arr[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        // print the 2d array
        for(int i = 0; i<3; i++){
            for(int j = 0; j<4; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        sc.close();
    }    
}
