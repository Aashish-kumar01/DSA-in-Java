import java.util.Arrays;
public class ShallowCopyDeepCopy {
    public static void main(String[] args) {
        int[] arr = {10, 20, 38, 40};
        // int[] x = arr; // x is shallow copy of arr
        // x[0] = 100; 

        int[] d = Arrays.copyOf(arr, arr.length);
        d[0] = 100; // d is deep copy of arr
        System.out.println(arr[0]);
    }
}
