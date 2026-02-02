public class SelectionSort {

    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {5, -2, 6, 7, 2, 8, 7, 2};
        int n = arr.length;
        print(arr);
        for(int i = 0; i<n-1; i++){ // n-1 passes matlab n-1 elemnent sort ho gaye
            int min = Integer.MAX_VALUE;
            int mindx = -1;
            for(int j = i; j<n; j++){
                if(arr[j] < min){
                    min = arr[j]; 
                    mindx = j;
                }
            } 
            // Swap 
            int temp = arr[i];
            arr[i] = arr[mindx]; 
            arr[mindx] = temp;
        }
        print(arr);
    }
}
