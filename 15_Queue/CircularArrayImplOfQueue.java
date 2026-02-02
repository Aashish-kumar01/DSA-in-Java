class CircularQueue{
    private int[] arr;
    private int f; 
    private int r;
    int size;
    CircularQueue(int capacity){
        arr = new int[capacity];
    }
    void add(int val){
        if(size == arr.length){
            System.out.println("Queue is full");
            return;
        }
        arr[r++] = val;
        if(r == arr.length) r = 0;
        size++;
    }

    int remove(){
        if(size == 0){
            System.out.println("Queue is empty");
            return -1;
        }
        int val = arr[f];
        f++;
        if(f == arr.length) f = 0;
        size--;
        return val;
    }

    int peek(){
        if(size == 0){
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[f];
    }

    void display(){
        if(size == 0){
            System.out.println("Queue is empty");
            return;
        }
        if(f<r){
            for(int i = f; i<r; i++){
                System.out.print(arr[i]+" ");
            }
        }
        else{
            for(int i = f; i<arr.length; i++){
                System.out.print(arr[i]+" ");
            }
            for(int i = 0; i<size-(arr.length-f); i++){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
    }
}

public class CircularArrayImplOfQueue {
    public static void main(String[] args) {
        CircularQueue q = new CircularQueue(5);
        q.add(1);   
        q.add(2);   
        q.add(3);   
        q.add(4);   
        System.out.println(q.size);
        q.display();
        q.add(5);
        System.out.println(q.size);
        q.remove();
        q.remove();
        q.remove();
        q.add(6);
        q.add(7);
        q.display();
        System.out.println(q.size);
    }
}
