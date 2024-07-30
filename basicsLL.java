package LinkedList;

public class basicsLL {
    Node head = null;
    Node tail = null;
    void addAtEnd(int data){
        Node temp = new Node(data);
        if (head==null){
            head = temp;
            tail = temp;
        }else{
            tail.next = temp;
            tail = temp;
        }
    }



    public static void displayR(Node head){
        Node temp = head;
        if (temp == null) return;
        System.out.print(temp.data+"->");
        displayR(temp.next);
    }

     void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
    }
    int length(){
        Node temp = head;
        int count = 0;
        while(temp != null){
            count++;
            temp= temp.next;
        }
        return count;
    }

    public static class Node{
        int data; //value
        Node next; //address of next node

        Node(int data){
            this.data = data;
            this.next = null;
        }


    }
    public static void main(String[] args) {
        basicsLL list = new basicsLL();
        list.addAtEnd(30);
        list.addAtEnd(60);
        list.addAtEnd(23);
        list.addAtEnd(70);


        list.display();
        System.out.println();
        System.out.println(list.length());
        }
}
