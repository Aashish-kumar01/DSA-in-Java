class Node2{
    int val; // default 0
    Node2 next; // default null

    Node2(int val){
        this.val = val;
    }
}

public class NodeOfLinkedList {
    public static void main(String[] args) {
        // 10->20->30->40->50
        Node2 a = new Node2(10);
        Node2 b = new Node2(20);
        Node2 c = new Node2(30);
        Node2 d = new Node2(40);
        Node2 e = new Node2(50);
        // Connect karenge (Link karenge)
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        System.out.println(a); 
        System.out.println(b);
        System.out.println(a.next);
    }
}
