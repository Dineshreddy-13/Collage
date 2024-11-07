package DataStructures;

public class BinaryTree {
    static class Treenode{
        int data;
        Treenode left,right;
        Treenode(int data){
            this.data = data;
            left=right = null;
        }
    }
    public static void preorder(Treenode node){
        if (node == null){
            return;
        }
        preorder(node.left);
        System.out.print(node.data + " ");
        preorder(node.right);
    }

    public static void main(String args[]){
        Treenode root = new Treenode(0);
        Treenode c1 = new Treenode(1);
        Treenode c2 = new Treenode(2);
        Treenode c3 = new Treenode(3);
        Treenode c4 = new Treenode(4);
        Treenode c5 = new Treenode(5);
        Treenode c6 = new Treenode(6);

        root.left = c1;
        root.right = c2;
        c1.left = c3;
        c1.right = c4;
        c2.left = c5;
        c2.right = c6;

        preorder(root);

    }

}

