import java.util.Scanner;
public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rotation: ");
        int d = sc.nextInt();
        int[] arr = {2, 4, 6, 15, 28, 39, 65, 72};
        int n = arr.length;
        d = d%n;

        reverse(arr, 0, d-1);
        reverse(arr, d, n-1);
        reverse(arr, 0, n-1);
        
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        sc.close();
    }

    public static void reverse(int[] arr, int i, int j){
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

    }
}
