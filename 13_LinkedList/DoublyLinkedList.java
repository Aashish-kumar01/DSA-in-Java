class ListNode{
    int val;
    ListNode next;
    ListNode prev;
    ListNode(int val){
        this.val = val;
    }
}
class DLL{
    ListNode head;
    ListNode tail;
    int size;
    void insertAtHead(int val){
        ListNode temp = new ListNode(val);
        if(head == null) head = tail = temp;
        else{
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
        size++;
    }

    void insertAtTail(int val){
        ListNode temp = new ListNode(val);
        if(head == null) head = tail = temp;
        else{
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
        size++;
    }

    void deleteAtHead(){
        if(size == 0){
            System.out.println("List is already empty");
            return;
        }
        if(size == 1) head = tail = null;
        else{
            head = head.next;
            head.prev = null;
        }
        size--;
    }

    void deleteAtTail(){
        if(size == 0){
            System.out.println("List is already empty");
            return;
        }
        if(size == 1) head = tail = null;
        else{
            tail = tail.prev;
            tail.next = null;
        }
        size--;
    }

    void display(){
        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    void displayreverse(){
        ListNode temp = tail;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.prev;
        }
        System.out.println();
    }

    void insert(int indx, int val){
        ListNode temp = new ListNode(val);
        if(indx > size || indx < 0){
            System.out.println("Index is out of bound");
            return;
        }
        if(indx == 0){
            insertAtHead(val);
            return;
        }
        if(indx == size){
            insertAtTail(val);
            return;
        }
        else{
            ListNode temp1 = head;
            for(int i = 0; i<indx-1; i++){
                temp1 = temp1.next;
            }
            temp.next = temp1.next;
            temp1.next = temp;
            temp.prev = temp1;
            temp.next.prev = temp;
        }
        size++;
    }

    void delete(int indx){
        if(indx < 0 || indx >= size){
            System.out.println("Index is out of bound");
            return;
        }
        if(indx == 0){
            deleteAtHead();
            return;
        }
        if(indx == size-1){
            deleteAtTail();
            return;
        }
        ListNode temp = head;
        for(int i = 0; i<indx-1; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        temp.next.prev = temp;
    }
}
public class DoublyLinkedList {
    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertAtHead(10);
        list.insertAtHead(20);
        list.insertAtHead(30);
        list.insertAtHead(40);
        list.display();
        System.out.println(list.size);
        // list.delete(1);
        // list.display();
        // list.insert(2,50);
        // list.display();
        // list.deleteAtHead();
        // list.display();
        // list.deleteAtTail();
        // list.display();
    }
}
