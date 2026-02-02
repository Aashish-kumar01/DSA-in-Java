import java.util.Stack;

class Node1{
    int val;
    Node1 left;
    Node1 right;
    Node1(int val){
        this.val = val;
    }
}

public class PreOrderIterative {
    public static void main(String[] args) {
        //       1
        //      / \
        //     2   3
        //    / \ / \
        //   4  56   7
        Node1 a = new Node1(1);
        Node1 b = new Node1(2);
        Node1 c = new Node1(3);
        Node1 d = new Node1(4);
        Node1 e = new Node1(5);
        Node1 f = new Node1(6);
        Node1 g = new Node1(7);
        a.left = b; b.left = d;
        c.left = f; b.right = e;
        a.right = c; c.right = g;

        Stack<Node1> st =  new Stack<>();
        st.push(a);
        while(!st.isEmpty()){
            Node1 curr = st.pop();
            System.out.print(curr.val + " ");

            if(curr.right != null)
                st.push(curr.right);

            if(curr.left != null)
                st.push(curr.left);
        }
    }
}
