// import java.util.*;
class ArrayList{// user defined data structuret
    int[] arr;
    int indx = 0;
    // int capacity;
    int size = 0;

    ArrayList(int capacity){
        arr = new int[capacity];
    }
    void add(int ele){
        if(indx == arr.length){
            // array is full
            capacityIncrease();
        }
        arr[indx++] = ele;
        size++;
    }

    void removeFromEnd(){
        indx--;
        size--;
    }

    void remove(int index){
        // complete it
        for(int i = index; i<arr.length-1; i++){
            arr[i] = arr[i+1];
        }
        size--;
    }

    void add(int indx, int val){
        size++;
        for(int i = arr.length-1; i>indx; i--){
            arr[i] = arr[i-1];
        }
        arr[indx] = val;
    }

    void capacityIncrease(){
        int[] arr2 = new int[arr.length*2];
        for(int i = 0; i<arr.length; i++){
            arr2[i] = arr[i];
        }
        arr = arr2;
    }

    int capacity(){
        return arr.length;
    }

    int get(int indx){
        return arr[indx];
    }

    void set(int index, int val){
        arr[index] = val;
    }

    void display(){
        for(int i = 0; i<size; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
public class OwnArrayList {
    public static void main(String[] args) {
        // ArrayList<Integer> arr = new ArrayList<>();
        ArrayList arr = new ArrayList(3);
        System.out.println(arr.capacity());
        arr.add(10); arr.add(20); arr.add(30);
        System.out.println(arr.size);
        arr.display();
        System.out.println(arr.get(1));
        arr.add(40);
        arr.display();
        arr.remove(3);
        arr.display();
        arr.add(1,50);
        arr.display();

        
        double x = 5/2;
        System.out.println(x);
    }
}
