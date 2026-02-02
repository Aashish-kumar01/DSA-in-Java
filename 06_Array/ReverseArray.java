public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {2, 14, 27, 38, 45, };
        int n = arr.length;

        // ye bhi ek tarika hai isko karne ka
        // for(int i =0; i<n/2; i++){
        //     int temp = arr[i];
        //     arr[i] = arr[n-1-i];
        //     arr[n-1-i] = temp;
        // }

        // int i = 2, j = 5; // ye 2 se 5 ke beech reverse kar dega
        int i = 0, j = n-1; 
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
