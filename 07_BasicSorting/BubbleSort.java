public class BubbleSort {
    public static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {5, -2, 6, 7, 2, 8, 7, 2};
        int n = arr.length;
        print(arr);

        for(int i = 0; i<n-1; i++){
            // Optimised way to do this.
            int swap = 0;
            for(int j = 0; j<n-1-i; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap++;
                }
            }
            if(swap==0) break;
        }
        print(arr);
    }
}

            
            // Bubble sort Optimised
            // boolean isSorted = true;
            // for(int j = 0; j<n-1-i; j++){
            //     if(arr[j]>arr[j+1]){
            //         int temp = arr[j];
            //         arr[j] = arr[j+1];
            //         arr[j+1] = temp;
            //         isSorted = false;
            //     }
            // }
            // if(isSorted == true) break;
            

            
            // Method to do this problem. ye ham likhe the 
            // int swap = 1;
            // if(swap != 0){
            //     for(int j = 0; j<n-1-i; j++){
            //         if(arr[j]>arr[j+1]){
            //             swap += 1;
            //             int temp = arr[j];
            //             arr[j] = arr[j+1];
            //             arr[j+1] = temp;
            //         }
            //         else swap = 0;
            //     }
            // }


            // this is not optimised.
            // boolean isSorted = true;
            // for(int k = 0; k<n-1; k++){
            //     if(arr[k] > arr[k+1]){
            //         isSorted = false;
            //         break;
            //     }
            // }
            // if(isSorted == false){
            //     for(int j = 0; j<n-1-i; j++){
            //         if(arr[j]>arr[j+1]){
            //             int temp = arr[j];
            //             arr[j] = arr[j+1];
            //             arr[j+1] = temp;
            //         }
            //     }
            // }
            // if(isSorted == true) break;



