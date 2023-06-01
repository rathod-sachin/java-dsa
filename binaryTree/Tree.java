package binaryTree;

import java.util.Scanner;

public class Tree {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Node root = createTree();

        preOrder(root);
        System.out.println();

        inOrder(root);
        System.out.println();

        postOrder(root);
    }
  public static Node createTree(){
        Node root;

        System.out.print("enter data: ");
        int data = sc.nextInt();

        if(data == -1){
            return null;
        }
        root = new Node(data);
        System.out.println("enter left for " + data );
        root.left = createTree();

        System.out.println("enter right for " + data);
        root.right = createTree();

        return root;
    }
    public static void inOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right) ;
    }
    public static void preOrder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void postOrder(Node root){
        if (root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }
}

//class Node {
//    Node left, right;
//    int data;
//
//    Node(int data){              // made another class Node!!!
//        this.data = data;
//        left = null;
//        right = null;
//    }
//}