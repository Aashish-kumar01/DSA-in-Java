import java.util.Arrays;

public class twoSum {
    public static void main(String[] args) {
        int[] arr = {7, 0, 4, 3, 2, 8, 10};
        Arrays.sort(arr);
        int i = 0, j = arr.length - 1;
        int target = 9;
        
        while(i < j){
            if(arr[i] + arr[j] > target){
                j--;
            } else if(arr[i] + arr[j] < target){
                i++;
            } else {
                System.out.println("The Sum of " + arr[i] + " and " + arr[j] + " is " + target);
                return; // pair mil gaya to exit
            }
        }
        
        System.out.println("No pair found");
    }
}
