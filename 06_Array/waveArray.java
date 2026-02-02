public class waveArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 8, 11, 43, 63};
        int n = arr.length;
        for(int i = 0; i<n-1; i+=2){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
        printarr(arr);
    }

    public static void printarr(int[] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
 