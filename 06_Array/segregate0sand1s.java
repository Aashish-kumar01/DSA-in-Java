public class segregate0sand1s {
    public static void main(String[] args) {
        int[] arr = {1, 0, 0, 0, 1, 1, 1, 0};
        int n = arr.length;
        segregate(arr, 0, n-1);
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }

    public static void segregate(int [] arr, int i, int j){
        // int n = arr.length;
        // two pass solution
        // int numberOfZeroes = 0;
        // for(int ele : arr){
        //     if(ele == 0) {
        //         numberOfZeroes++;
        // }
        // // System.out.println(numberOfZeroes);
        
        // for(int i = 0; i<numberOfZeroes; i++){
        //     arr[i] = 0;                              
        // }
        // for(int i = numberOfZeroes; i<=numberOfZeroes+numberofOnes-1; i++){
        //     arr[i] = 1;
        // }



        // ye ek dusra method is question ko karne ka 
        while (i < j) {
            // if (arr[i] == 0 && arr[j] == 0) {
            //     i++;
            // } 
            // else if (arr[i] == 1 && arr[j] == 1) {
            //     j--;
            // } 
            // else if (arr[i] == 1 && arr[j] == 0) {
            //     // swap
            //     int temp = arr[i];
            //     arr[i] = arr[j];
            //     arr[j] = temp;
            //     i++;
            //     j--;                                       
            // } 
            // else { 
            //     i++;
            //     j--;
            // }

            if(arr[i] == 0) i++;
            else if(arr[j] == 1) j--;
            else if(arr[i] == 1 && arr[j] == 0){
                arr[i] = 0;
                arr[j] = 1;
                i++;
                j--;
            }                        
        }
    }
}
        

        
