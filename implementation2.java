package LinkedList;

public class implementation2 {
    static class Node{
        int data;
        Node next;

          Node(int data){
              this.data=data;
              this.next=next;
          }
    }
    Node head = null;
    Node tail = null;

    void AddAtEnd(int data){
        Node x = new Node(data);
        if(head == null){
            head = x;
            tail = x;
        }else{
            tail.next = x;
            tail = x;

        }
    }

    void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
    }

    int size(){
        Node temp = head;
        int count = 0;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }

    void AddAtFirst(int data){
        Node temp = new Node(data);
        if(head == null){
            head = temp;
            tail = temp;
        }else{
            temp.next = head;
            head = temp;
        }
    }

    void insertAtIdx(int idx, int data){
        Node t = new Node(data);
        Node temp = head;
        for (int i=0; i<idx-1; i++){
            temp = temp.next;
        }
        t.next = temp.next;
        temp.next = t;

    }

    public static void main(String[] args) {
        implementation2 ll = new implementation2();
        ll.AddAtEnd(20);
        ll.AddAtEnd(30);
        ll.AddAtEnd(40);
        ll.display();
        System.out.println();
        System.out.println("size of linked list is = " + ll.size());
        ll.insertAtIdx(2,50);
        ll.display();
    }
}
