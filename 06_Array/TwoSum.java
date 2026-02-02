import java.util.Scanner;
public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sum: ");
        int[] arr = {23, 5, 354, -234, 34, 83, 94, 105};
        int target = sc.nextInt();
        System.out.print(twosum(arr, target));
        sc.close();
    }
    
    public static boolean twosum(int[] arr, int target){
        int n = arr.length;
        for(int i =0; i<n; i++){
            for(int j =i+1; j<n; j++){
                if(arr[i]+arr[j] == target){
                    return true;
                }
            }
        }
        return false;
    }
    
}


        // Another way to do this problem
        // boolean flag = false;
        // for(int i = 0; i<arr.length; i++){
        //     for(int j = i+1; j<arr.length; j++){
        //         if(arr[i] + arr[j] == target){
        //             flag = true;
        //             break;
        //         }
        //     }
        // }
        // if(flag) System.out.println("The sum of two number is "+target);
        // else System.out.println("The target is not found.");

