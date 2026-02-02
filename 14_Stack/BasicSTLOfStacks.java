import java.util.Stack;

public class BasicSTLOfStacks {
    public static void main(String[] args) {
        Stack<String> st = new Stack<>();
        // System.out.println(st.pop()); // it will throw an exception emptystack exception (underflow)
        st.push("Aashish");
        st.push("Kashish");
        st.push("Rishika");
        st.push("Isha");
        st.push("Priya");
        System.out.println(st.size());
        System.out.println(st); // Auxiliary space is O(n)
        st.pop();
        System.out.println(st+" "+st.size());
        System.out.println(st.peek());
        System.out.println(st.pop()); // it returns the topmost element and then removes it
    }
}
