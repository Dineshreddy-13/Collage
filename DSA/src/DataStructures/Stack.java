package DataStructures;
import java.util.Scanner;

public class Stack {
    int arr[],top,max;

    Stack(int size){
        arr = new int[size];
        top = -1;
        max = size;
    }

    public void push(int data){
        if (isFull()){
            System.out.println("--> Stack overflow");
            return;
        }
        arr[++top] = data;
    }

    public boolean isFull(){
        return top == max - 1;
    }

    public int pop(){
        if (isEmpty()){
            System.out.println("stack underflow");
            return -1;
        }
        int x = arr[top--];
        return x;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public int peek(){
        return arr[top];
    }

    public void display(){
        if (isEmpty())
            System.out.println("--> stack underflow");
            for (int i = top; i>=0; i--){
                System.out.println("|_" + arr[i] + "_|");
            }
    }

    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the stack : ");
        Stack s1 = new Stack(sc.nextInt());
        boolean loop = true;
        do{
            System.out.println("\nMenu : \n1.push\n2.pop\n3.peek\n4.display\n5.Exit");
            System.out.print("enter your choice : ");
            switch(sc.nextInt()){
                case 1 -> {
                    System.out.print("Enter the no of elements to be pushed : ");
                    int n = sc.nextInt();
                    System.out.print("Enter the elements : ");
                    for(int i = 0; i < n; i++){
                        s1.push(sc.nextInt());
                    }
                }
                case 2 -> s1.pop();
                case 3 -> s1.peek();
                case 4 -> s1.display();
                case 5 -> loop = false;
                default -> System.out.println("Invalid choice");
            }
        }while(loop);
        sc.close();
    }   
}