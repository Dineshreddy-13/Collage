package DataStructures;

public class DoubleEndedQueue {
    int front,rear,max;
    int[] arr;
    DoubleEndedQueue(int size){
        arr = new int[size];
        front = rear = -1;
        max = size;
    }

    public void insertFront(int data){
        if(front == 0){
            System.out.println("front is full");
            return;
        }
        if (front == -1){
            arr[++front] = data;
            rear++;
            return;
        }
        arr[--front] = data;
    }

    public void insertRear(int data){
        if (rear == max - 1){
            System.out.println("rear is full");
            return;
        }
        if (front == -1){front++;}
        arr[++rear] = data;
    }

    public int deleteFront(){
        if (front == -1){
            System.out.println("queue is empty");
            return -1;
        }
        int x = arr[front];
        if (front == rear)
            front = rear = -1;
        else
            front++;
        return x;
    }

    public int deleteRear(){
        if(rear == -1){
            System.out.println("queue is empty");
            return -1;
        }
        int x = arr[rear];
        if (front == rear)
            front = rear = -1;
        else
            rear--;
        return x;
    }

    public void display(){
        System.out.print("| ");
        for(int i = front; i<= rear; i++){
            System.out.print(arr[i] + " | ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        DoubleEndedQueue d = new DoubleEndedQueue(5);
        d.insertFront(1);
        d.insertRear(2);
        d.insertRear(3);
        d.insertRear(4);
        d.deleteFront();
        d.insertFront(9);
        d.display();
    }


}
