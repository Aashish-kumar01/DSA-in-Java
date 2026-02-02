import java.util.ArrayList;
import java.util.Collections;
public class ArrLstInJavaBscs {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        // add any element in the array from the last it is just like append
        arr.add(2);
        arr.add(4);
        arr.add(6);
        arr.add(13);
        arr.add(15);

        System.out.println(arr.get(2)); // arr[2]
        arr.set(3,28); // arr[3] = 28

        System.out.println(arr); // not traversing the array by ourselves
        int n = arr.size(); // arr.length
        for(int i = 0; i<n; i++){
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
        for(int ele : arr){
            System.out.print(ele+" ");
        }

        // add any element in the array in the given index
        arr.add(3, 24);
        System.out.println(arr);
        
        // remove any element in the array
        arr.remove(2);
        System.out.println(arr);
        
        // it is use to reverse the element of the array
        Collections.reverse(arr);
        System.out.println(arr);

        // arraylist ko reverse karne ka tarika ye bhi ho skta hai
        int i = 0, j = arr.size()-1;
        while(i<j){
            int temp = arr.get(i);
            arr.set(i,arr.get(j));
            arr.set(j,temp);
            i++;
            j--;
        }

        // iski madad se ham arraylist me character ko store kara sakte hai
        // ArrayList<Character> arr2 = new ArrayList<>();

    }
}
