import java.util.Scanner;
public class hw1arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int x = sc.nextInt();
        System.out.print("Enter the elements of the array: ");

        int[] arr = new int[x]; 
        for(int i = 0; i<x; i++){
            arr[i] = sc.nextInt();
        }

        int prdt = 1;
        for(int i = 0; i<x; i++){
            prdt *= arr[i];
        }
        System.out.print(prdt);

        sc.close();
    }
}
