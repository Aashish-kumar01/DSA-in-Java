import java.util.Scanner;
public class PrintMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int x = sc.nextInt();
        System.out.print("Enter the element of the array: ");

        int[] arr = new int[x];
        for(int i =0; i<x; i++){
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        // int max = Integer.MIN_VALUE; // Minimum value in he integer
        for(int i = 1; i<x; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);

        sc.close();
    }
}
