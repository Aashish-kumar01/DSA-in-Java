import java.util.LinkedList;
import java.util.Queue;

public class TraversalInQueue {
    public static void display(Queue<Integer> q){
        int size = q.size();
        for(int i = 0; i<size; i++){
            int ele = q.remove();
            System.out.print(ele+" ");
            q.add(ele);
        }
        System.out.println();
    }
    private static void add(Queue<Integer> q, int indx, int val) {
        int s = q.size();
        if(indx < 0 || indx > s){
            System.out.println("Index is out of bound");
            return;
        }
        if(indx == s){
            q.add(val);
            return;
        }
        for(int i = 0; i<indx; i++){
            q.add(q.remove());
        }
        q.add(val);
        for(int i = 0; i<s-indx; i++){
            q.add(q.remove());
        }
    }
    private static int remove(Queue<Integer> q, int indx) {
        if(indx < 0 || indx >= q.size()){
            System.out.println("Index is out of bound ");
            return -1;
        }
        if(indx == 0){
            return q.remove();
        }
        for(int i = 0; i<indx; i++){
            q.add(q.remove());
        }
        int ele = q.remove();
        for(int i = 0; i<q.size()-indx; i++){
            q.add(q.remove());
        }

        return ele;
    }
    private static int peek(Queue<Integer> q, int indx) {
        int s = q.size();
        if(indx < 0 || indx >= s){
            System.out.print("Index is out of bound ");
            return -1;
        }
        if(indx == 0){
            return q.peek();
        }
        for(int i = 0; i<indx; i++){
            q.add(q.remove());
        }
        int peek = q.peek();
        for(int i = 0; i<s-indx; i++){
            q.add(q.remove());
        }

        return peek;
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        display(q);
        add(q, 3, 80);
        display(q);
        remove(q,3);
        display(q);
        System.out.println(peek(q,6));
    }
}
