public class ArrayBasics {
    public static void main(String[] args) {
        int[] arr = {3, 234, 42, 54, 72, 1, 64};
        // indexing
        System.out.println(arr[1]);

        // Updating - mutable
        System.out.println(arr[2]);
        arr[2] = 84;
        System.out.println(arr[2]);

        // Intializing array
        int[] ar = new int[4];
        ar[0] = 10; 
        ar[1] = 20; 
        ar[2] = 30; 
        ar[3] = 40;


    }
}
