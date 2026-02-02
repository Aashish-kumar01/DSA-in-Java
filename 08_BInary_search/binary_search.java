import java.util.Arrays;
import java.util.Scanner;

public class binary_search {
    public static int binarysearch(int[] arr, int k, int n){
        int lo = 0, hi = n-1;
        while(lo <= hi){
            int mid = (lo + hi)/2;
            if(arr[mid] < k) lo = mid+1;
            else if(arr[mid] > k) hi = mid-1;
            else return mid;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        System.out.print("Enter the distinct element of the array : ");
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the target: ");
        int k = sc.nextInt();
        Arrays.sort(arr);

        System.out.print(binarysearch(arr, k, n));

        sc.close();
    }
}