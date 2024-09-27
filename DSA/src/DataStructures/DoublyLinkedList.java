package DataStructures;
public class DoublyLinkedList { // status -> complete
    Node head;

    static class Node{
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public void insertAtEnd(int data){
        Node newnode = new Node(data);
        if (head == null){
            head = newnode;
            return;
        }

        Node current = head;
        while(current.next !=null){
            current = current.next;
        }
        current.next = newnode;
        newnode.prev = current;

    }

    public void insertAtStart(int data){
        Node newnode = new Node(data);
        if (head == null){
            head = newnode;
        }else{
            newnode.next = head;
            head.prev = newnode;
            head = newnode; 
        }
    }

    public void insertAtpos(int pos ,int data){
        Node newnode = new Node(data);

        if (pos == 1){
            if (head == null){
                newnode.next = head;
                head = newnode;
            }else{
                newnode.next = head;
                head.prev = newnode;
                newnode = head; 
            }
            return;
        }
        Node current  = head;
        int starpos = 1;
        while(starpos< (pos-1) && current != null){
            current = current.next;
        }
        if (current == null){
            System.out.println("cannot add at this position");
            return;
        }

        newnode.next = current.next;
        current.next.prev = newnode;
        newnode.prev = current;
        current.next = newnode;
    }

    public void delete(int key){
        Node temp = head;
        Node prevoius = null;

        if(temp != null && temp.data == key){
            head = temp.next;
            if(head != null){
                head.prev = null;
            }
        }

        while(temp != null && temp.data != key){
            prevoius = temp;
            temp = temp.next;
        }
        if (temp == null){
            System.out.println("key Not found");
            return;
        }
        if (temp.next != null){
            prevoius.next = temp.next;
            temp.next.prev = prevoius;
        }else{
            prevoius.next = null;
        }

    }

    public void Display(){
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        
        while (current != null ){
            System.out.print(current.data + " -> ");
            current = current.prev;
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList d1 = new DoublyLinkedList();
        d1.insertAtEnd(0);
        d1.insertAtEnd(1);
        d1.insertAtEnd(2);
        d1.insertAtEnd(3);
        d1.insertAtEnd(4);
        // d1.delete(3);
        d1.insertAtpos(2,7);
        d1.Display();
    }



}
