import java.util.Stack;
import java.util.ArrayList;

class Node3{
    int val;
    Node3 left;
    Node3 right;

    Node3(int val){
        this.val = val;
    }
}

public class InOrderIterative {
    public static void main(String[] args) {
        //       1
        //      / \
        //     2   3
        //    / \ / \
        //   4  56   7
        Node3 a = new Node3(1);
        Node3 b = new Node3(2);
        Node3 c = new Node3(3);
        Node3 d = new Node3(4);
        Node3 e = new Node3(5);
        Node3 f = new Node3(6);
        Node3 g = new Node3(7);
        a.left = b; b.left = d;
        c.left = f; b.right = e;
        a.right = c; c.right = g;
        ArrayList<Integer> ans = new ArrayList<>();

        Stack<Node3> st = new Stack<>();
        Node3 curr = a;
        while(st.size() > 0 || curr != null){
            if(curr != null){
                if(curr.left != null){
                    st.push(curr);
                    curr = curr.left;
                }
                else{
                    ans.add(curr.val);
                    curr = curr.right;
                }
            }
            else{ // curr == null
                Node3 top = st.pop();
                ans.add(top.val);
                curr = top.right;
            }
        }

        for(int x : ans){
            System.out.println(x);
        }
    }
}
