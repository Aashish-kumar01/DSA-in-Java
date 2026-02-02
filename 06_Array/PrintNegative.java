import java.util.Scanner;
public class PrintNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int x = sc.nextInt();
        System.out.print("Enter the element of the array: ");

        int[] arr = new int[x];
        for(int i = 0; i<x; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i<arr.length; i++){
            System.out.print((arr[i]<0 ? arr[i]+" ":""));
            // if(arr[i]<0){
            //     System.out.print(arr[i]+" ");
            // }
        }

        sc.close();
    }
}
