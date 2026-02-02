import java.util.Stack;

class Node2{
    int val;
    Node2 left;
    Node2 right;

    Node2(int val){
        this.val = val;
    }
}

public class PostOrderIterative {
    public static void main(String[] args) {
        //       1
        //      / \
        //     2   3
        //    / \ / \
        //   4  56   7
        Node2 a = new Node2(1);
        Node2 b = new Node2(2);
        Node2 c = new Node2(3);
        Node2 d = new Node2(4);
        Node2 e = new Node2(5);
        Node2 f = new Node2(6);
        Node2 g = new Node2(7);
        a.left = b; b.left = d;
        c.left = f; b.right = e;
        a.right = c; c.right = g;

        Stack<Node2> st = new Stack<>();
        st.push(a);
        Stack<Node2> st1 = new Stack<>();
        while(!st.isEmpty()){
            Node2 top = st.pop();
            st1.push(top);

            if(top.left != null) st.push(top.left);
            if(top.right != null) st.push(top.right);
        }

        // We are doing reverse of (reverse of preOrder)
        while(st1.size() > 0){
            System.out.print(st1.pop().val+" ");
        }
        System.out.println();
    }
}
