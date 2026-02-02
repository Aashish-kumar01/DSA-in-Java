class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}

public class DisplayList {
    public static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }

        // By recursion
        // if(head == null) return;
        // System.out.print(head.val+" ");
        // display(head.next);

    }
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40); 
        Node e = new Node(50);
        Node f = new Node(60);

        a.next = b; 
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        // display(a);

        System.out.println(get(a,4));
    }

    public static int get(Node head, int indx){
        Node temp = head;
        for(int i = 0; i<indx; i++){
            temp = temp.next;
        }
        return temp.val;
    }
}
