package DataStructures;

public class CircularQueue { // status -> complete
    int arr[];
    int front,rear,max,size;
    CircularQueue(int capacity){
        arr = new int[capacity];
        front = rear = -1;
        max = capacity;
        size = 0;
    }

    public void enqueue(int data){
        if (isFull()){
            System.out.println("queue is full");
            return;
        }
        if(front == -1) front++;
        rear = (rear+1) % max;
        arr[rear] = data;
        size++;
    }
    public boolean isFull(){
        return size == max;
    }

    public int dequeue(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return -1;
        }
        int x = arr[front];
        if(front == rear)
            front = rear = -1;
        front = (front+1) % max;
        size--;
        return x;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void display(){
        for(int i = 0; i<size;  i++){
            System.out.print(arr[(front+i) % max]+" ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        CircularQueue cl = new CircularQueue(5);
        cl.enqueue(1);
        cl.enqueue(2);
        cl.enqueue(3);
        cl.dequeue();
        cl.enqueue(4);
        cl.display();

    }

}
