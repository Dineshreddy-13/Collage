package DataStructures;

public class CircularLinkedList { // status -> complete
    Node tail;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void insertAtBeginning(int data){
        Node newnode = new Node(data);
        if (tail == null){
            tail = newnode;
            tail.next = tail;
            return;
        }
        newnode.next = tail.next;
        tail.next = newnode;
    }

    public void insertAtEnd(int data){
        Node newnode = new Node(data);
        if (tail == null){
            tail = newnode;
            tail.next = tail;
            return;
        }
        newnode.next = tail.next;
        tail.next = newnode;
        tail = newnode;
    }

    public void display(){
        Node current = tail.next;
        while(true){
            System.out.print(current.data + " -> ");
            current = current.next;
            if (current == tail.next) return;
        }
    }

    public void insertAtPos(int data , int pos){
        if (tail == null){
            if (pos != 1 ){
                System.out.println("Linked is empty, vaild position is 0");
                return;
            }
        }

        Node newnode = new Node(data);
        if (pos == 1){ // for first position
            newnode.next = tail.next;
            tail.next = newnode;
            return;
        }
        
        Node current = tail.next;  // for other than first position
        int start = 1;
        while(start< pos-1){
            current = current.next;
            if (current == tail.next){
                System.out.println("position out of bounds");
            }
            start++;
        }
        newnode.next = current.next;
        current.next = newnode;

        if (current == tail)
            tail = newnode;

    }

    public int delete(int key){
        if (tail == null) return -1;
        Node curr = tail.next;
        Node prev = tail;
        // for only one node
        if (curr == tail && curr.data == key){
            tail = null;
            return key;
        }
        // for first node
        if (curr.data == key){
            tail.next = curr.next;
            curr = curr.next;
            return key; 
        }
        // for other than first
        while(curr != tail && curr.data != key){
            prev = curr;
            curr = curr.next;
        }

        if(curr.data == key){
            prev.next = curr.next;
            if(curr == tail){ //if last node
                tail = prev;
            }
            return key;
        }
        return -1;
    }

    public static void main(String args[]){
        CircularLinkedList cl = new CircularLinkedList();
        cl.insertAtBeginning(1);
        cl.insertAtPos(2, 2);
        cl.insertAtEnd(3);
        // cl.delete(2);
        cl.display();
    }
}
