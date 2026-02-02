import java.util.Stack;

public class hw1 {
    public static void pushEle(Stack<Integer> st, int ele){
        if(st.size() == 0){
            st.push(ele);
            return;
        }
        int top = st.pop();
        pushEle(st,ele);
        st.push(top);
    }
    public static void reverse(Stack<Integer> st){
        if(st.size() == 1) return;
        int top = st.pop();
        reverse(st);
        pushEle(st,top);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        int ele = 50;
        pushEle(st,ele);
        System.out.println(st);
        reverse(st);
        System.out.println(st);
    }
}
