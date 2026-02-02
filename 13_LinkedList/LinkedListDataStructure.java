class Node1{ // user defined data type
    int val;
    Node1 next;

    Node1(int val){
        this.val = val;
    }
}

class linkedlist{ // user defined data structure
    Node1 head; // null
    Node1 tail; // null
    int size;
    // linkedlist(){
    //     head = tail = null;
    // }

    // Add the Node1 at the head of linked list
    void addAtHead(int val){
        Node1 temp = new Node1(val);
        if(head == null) head = tail = temp;
        else{
            temp.next = head;
            this.head = temp;
        }
        size++;
    }

    // Add a Node1 at the tail of the linked list
    void addAtTail(int val){
        Node1 temp = new Node1(val);
        if(head == null) head = tail = temp;
        else{
            this.tail.next = temp;
            this.tail = temp;
        }
        size++;
    }

    // Add the value at Tail by calling the Add the Head.
    // void addAtTail(int val){
    //     if(head == null){
    //         addAtHead(val);
    //         return;
    //     }
    //     Node1 temp = new Node1(val);
    //     this.tail.next = temp;
    //     this.tail = temp;
    //     size++;
    // } 

    // Delete the Node1 at the Head of the Linked list
    void deleteAtHead(){
        if(head == null){
            System.out.println("Linked list is empty");
            return;
        }
        this.head = head.next;
        if(head == null) tail = null;
        size--;
    }

    // search the value in the Linked list
    int search(int val){
        if(head == null) return -1;
        Node1 temp = head;
        int indx = 0;
        while(temp != null){
            if(temp.val == val) return indx;
            temp.next = temp;
            indx++;
        }
        return -1;
    }

    // insert the value at some index in Linked list
    void insert(int indx, int val){
        if(indx > size || indx < 0){
            System.out.println("Can't insert the element");
            return;
        }
        if(indx == 0){
            addAtHead(val);
            return;
        }
        if(indx == size){
            addAtTail(val);
            return;
        }
        Node1 t = new Node1(val);
        Node1 temp = head;
        for(int i = 0; i<indx-1; i++){
            temp = temp.next;
        }
        t.next = temp.next;
        temp.next = t;
        size++;
    }

    // Delete the Node1 at some index in linked list
    void delete(int indx){
        if(indx < 0 || indx >= size){
            System.out.println("Can't delete the Node1 at the given index");
        }
        // else if(indx == size-1){
        //     Node1 temp = head;
        //     for(int i = 0; i<indx-1; i++){
        //         temp = temp.next;
        //     }
        //     temp.next = null;
        //     tail = temp;
        //     size--;
        // }
        else if(indx == 0){
            deleteAtHead();
        }
        else{
            Node1 temp = head;
            for(int i = 0; i<indx-1; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next; // deleting
            if(indx == size-1) tail = temp;
            size--;
        }
    }

    // get the value of the Linked list at some index
    int get(int indx){
        Node1 temp = head;
        for(int i = 1; i<=indx; i++){
            temp = temp.next;
        }
        return temp.val;
    }

    // print the Linked list
    void display(){
        if(head == null) return;
        Node1 temp = head;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class LinkedListDataStructure {
    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.addAtTail(10);
        ll.addAtTail(20);
        ll.addAtTail(30);
        ll.addAtTail(40);
        ll.display();
        ll.addAtHead(50);
        ll.display();

        System.out.println(ll.size);
        ll.insert(2,90);
        ll.display();
        System.out.println(ll.size);
        ll.delete(0);
        ll.display();
        System.out.println(ll.size);
    }
}
