public class SecondMax {
    public static void main(String[] args) {
        int[] arr = {4, 53, 63, 4, 25, 93, 93, 0, 62};
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        // calculate max
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>max) max = arr[i];
        }
    
        // calculate second max 
        for(int i =0; i<arr.length; i++){
            if(arr[i]>smax && arr[i]!=max) smax = arr[i];
        }
        System.out.println(max);
        System.out.println(smax);
        
    }
}
