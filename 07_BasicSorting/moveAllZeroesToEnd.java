public class moveAllZeroesToEnd {
    public static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {0, -2, 0, 7, 0, 8, 7, 2};
        int n = arr.length;
        print(arr);

        // this is correct but not optimised.
        // for(int i = 0; i<n-1; i++){
        //     // Optimised way to do this.
        //     int swap = 0;
        //     for(int j = 0; j<n-1-i; j++){
        //         if(arr[j]==0 && arr[j+1] != 0){
        //             int temp = arr[j];
        //             arr[j] = arr[j+1];
        //             arr[j+1] = temp;
        //             swap++;
        //         }
        //     }
        //     if(swap==0) break;
        // }


        // this is optimised way to do this thing.
        int j = 0;
        for(int i = 0; i<n; i++){
            if(arr[i] != 0){
                if(i!=j){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }


        print(arr);
    }
}