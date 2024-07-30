package LinkedList;


public class implementation {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
    Node head = null;
    Node tail = null;




    void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ->> ");
            temp = temp.next;
        }
    }
    void inserAtidx(int idx, int data){
        Node x = new Node(data);
        Node temp = head;
        for (int i=1; i<=idx-1; i++){
            temp = temp.next;
        }
        x.next = temp.next;
        temp.next = x;
    }




    int size(){
        Node temp = head;
        int count = 0;
        while(temp!=null){
            count++;
            temp = temp.next;;
        }
        return count;

    }
//    static class Node {
//        int data;
//        Node next;
//
//        Node(int data) {
//            this.data = data;
//        }
//    }

//   Node head = null;
//    Node tail = null;

    void addAtEnd(int data) {
        Node temp = new Node(data);
        if (head == null) {
            head = temp;
            tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }
    }
    void addAtFirst(int data) {
        Node temp = new Node(data);
        if (head == null) { //empty list
            head = temp; //head = temp = tail;
            tail = temp;
        } else {
            temp.next = head;
            head = temp;
        }
    }

        public static void main(String[] args){
            implementation ll = new implementation();
            ll.addAtEnd(10);
            ll.addAtEnd(20);
            ll.display();

        }

}
