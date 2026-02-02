// import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class Basics{
    public static void main(String[] args) {
        // Queue<Integer> q1 = new ArrayDeque<>();
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println(q); // nakli printing 
        q.remove();
        System.out.println(q);
        System.out.println(q.size());
        System.out.println(q.peek());
    }
}