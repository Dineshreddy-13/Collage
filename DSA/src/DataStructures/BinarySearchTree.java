package DataStructures;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinarySearchTree {
    Queue<Node> queue = new LinkedList<>();
    Node root;
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data = data;
            left = right = null;
        }
    }

    private Node callInsert(Node root ,int data){
        Node newNode = new Node(data);
        if (root == null){
            root = newNode;
            return root;
        }
        if(root.data > newNode.data)
            root.left = callInsert(root.left, data);
        else if(root.data < newNode.data)
            root.right = callInsert(root.right, data);
        
        return root;
    }

    public void insert(int data){ root = callInsert(root, data);};

    private void callPreOrder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        callPreOrder(root.left);
        callPreOrder(root.right);
    }

    public void PreOrder(){callPreOrder(root);}

    private void callInOrder(Node root){
        if(root == null){
            return;
        }
        callInOrder(root.left);
        System.out.print(root.data + " ");
        callInOrder(root.right);
    }

    public void inOrder(){callInOrder(root);}

    private void callPostOrder(Node root){
        if(root == null){
            return;
        }
        callPostOrder(root.left);
        callPostOrder(root.right);
        System.out.print(root.data + " ");
    }

    public void PostOrder(){callPostOrder(root);}

    private void callLevelOrder(Node root){
        if(root == null) return;
        queue.add(root);
        while(!queue.isEmpty()){
            root = queue.poll();
            if (root != null){
                System.out.print(root.data + " ");
                queue.add(root.left);
                queue.add(root.right);
            }
        }
    }

    public void levelOrder(){callLevelOrder(root);}

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int choice;
        BinarySearchTree tree = new BinarySearchTree();
        do{
            System.out.println("\n1.insert\n2.preorder\n3.inorder\n4.postorder\n5.levelorder\n6.Exit");
            System.out.print("Enter the choice : ");
            choice = sc.nextInt();
            switch (choice) {
                case 1 ->{
                    System.out.print("Enter the number of elements to be inserted : ");
                    int n = sc.nextInt();
                    System.out.print("Enter the data (Space seperated) : ");
                    for(int i = 0; i < n; i++){
                        tree.insert(sc.nextInt());
                    }
                } 
                case 2 -> tree.PreOrder();
                case 3 -> tree.inOrder();
                case 4 -> tree.PostOrder();
                case 5 -> tree.levelOrder();
                case 6 -> System.out.println("Exiting..");
                default -> System.out.println("invalid choice");
            }
        }while(choice != 6);
        sc.close();
    }
}

