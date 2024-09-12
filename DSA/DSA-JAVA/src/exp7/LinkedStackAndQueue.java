package exp7;
import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class LinkedStack {
    Node top;
    public void push(int data) {
        Node newnode = new Node(data);
        if (top == null) {
        top = newnode;
        return;
        }
        newnode.next = top;
        top = newnode;
}

    public int pop() {
        if (top == null) {
            System.out.println("underflow");
            return -1;
        }
        int x = top.data;
        top = top.next;
        return x;
    }

    public void display() {
        if (top == null){
            System.out.println("queue is empty");
            return;
        }
        Node current = top;
        while(current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void stackMenu(LinkedStack l1,Scanner sc) {
        boolean loop = true;
        System.out.println("1.push\n2.pop\n3.Display\n4.exit");
        do {
            System.out.print("choose an option : ");
            int x = sc.nextInt();
        switch(x) {
            case 1 ->{
                System.out.print("Enter number of elements to be enqueued : ");
                int times = sc.nextInt();
                System.out.print("enter data : ");
                for (int i = 0; i<times; i++){
                int data = sc.nextInt();
                l1.push(data);}
            }
            case 2 ->{System.out.println("pop successfull -> " + l1.pop());}
            case 3 -> l1.display();
            case 4 ->{System.out.println("exiting..");loop = false;}
        }
        }while(loop);
    }
}


class LinkedQueue {
    Node front;
    Node rear;

    public void enqueue(int data) {
        Node newnode = new Node(data);
        if (front == null) {
        rear = front = newnode;
        return;
        }
        rear.next = newnode;
        rear = rear.next;
    }

    public int dequeue() {
        if (front == null) {
            System.out.println("Queue is empty");
            return -1;
        }
        int x = front.data;
        front = front.next;
        return x;
        }

    public void display() {
        if (front == null){
            System.out.println("queue is empty");
            return;
        }
            Node current = front;
            while(current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public static void queueMenu(LinkedQueue l1,Scanner sc) {
        boolean loop = true;
        do {
            System.out.println("1.Enqueue\n2.Dequeue\n3.Display\n4.exit");
            System.out.print("choose an option : ");
            int x = sc.nextInt();
        switch(x) {
        case 1 ->{
            System.out.print("Enter number of elements to be enqueued : ");
            int times = sc.nextInt();
            System.out.print("enter data : ");
            for (int i = 0; i<times; i++){
                int data = sc.nextInt();
                l1.enqueue(data);}
            }
        case 2 -> {System.out.println("dequeue successfull -> " + l1.dequeue());}
        case 3 -> l1.display();
        case 4 -> {System.out.println("exiting..");loop = false;}
        }
        }while(loop);
    }
}
public class LinkedStackAndQueue {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        boolean loop = true;
        do {
            System.out.println("1.LinkedStack\n2.LinkedQueue\n3.Exit");
            System.out.print("choose datatype : ");
            int x = sc.nextInt();
            switch(x) {
            case 1 -> LinkedStack.stackMenu(new LinkedStack(),sc);
            case 2 -> LinkedQueue.queueMenu(new LinkedQueue(),sc);
            case 3 -> loop = false;
            }
        }while(loop);
        sc.close();
    }
    }
