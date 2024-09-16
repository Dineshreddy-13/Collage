package exp3;

public class LinearQueue {
    int[] arr;
    int front,rear,max;
    LinearQueue(int size){
        arr = new int[size];
        front = rear = -1;
        max = size;
    }

    public void Enqueue(int data){
        if(isFull()){
            System.out.println("queue is full");
            return;
        }
        if(front == -1)
            front++;
        arr[++rear] = data; 
    }
    public boolean isFull(){
        return rear == max -1;
    }

    public int dequeue(){
        if (isEmpty()){
            System.out.println("queue is empty");
        }
        int x = arr[front];
        if (front == rear)
            front = rear = -1;
        else
            front++;
        return x;
    } 

    public boolean isEmpty(){
        return front == -1;
    }

    public void display(){
        for(int i = front; i<= rear; i++ ){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]){
        LinearQueue l1 = new LinearQueue(5);
        l1.Enqueue(1);
        l1.Enqueue(2);
        l1.Enqueue(3);
        l1.dequeue();
        l1.display();
    }

}
