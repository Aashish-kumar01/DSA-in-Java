import java.util.Scanner;
public class OutputInputArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the element of the array: ");
        int[] arr = {2, 3, 6, 7, 24, 53, 6534};
        int len = arr.length;
        for(int i =0; i<len; i++){
            System.out.print(arr[i]+" ");
        }


        // Default value
        // int[] Ashish = new int[7];
        // for(int i =0; i<Ashish.length; i++){
        //     System.out.print(Ashish[i]+" ");
        // }
        // By default all values in the array are zero
        
        
        
        int[] Ashish = new int[7];
         for(int i = 0; i<7; i++){
             Ashish[i] = sc.nextInt();
             // int x = sc.nextInt();
            //  Ashish[i] = x;
            }
            
        for(int i =0; i<Ashish.length; i++){
            System.out.print(Ashish[i]*2+" ");
        }

        sc.close();
    }
}
