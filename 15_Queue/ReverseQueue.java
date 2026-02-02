import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {
    private static void reverse(Queue<Integer> q) {
        Stack<Integer> st = new Stack<>();
        int n = q.size();
        for(int i = 0; i<n-1; i++){
            st.push(q.remove());
        }
        int s = st.size();
        for(int i = 0; i<s; i++){
            q.add(st.pop());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        reverse(q);
        System.out.println(q);
    }
}
