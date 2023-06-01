package binaryTree;

import java.util.Scanner;

import static binaryTree.Tree.createTree; // either do this or....

public class HeightOfBinaryTree {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Node root = createTree();

        System.out.println(height(root));
    }
    public static int height(Node root){
        if(root == null){
            return 0;
        }
        return Math.max(height(root.left), height(root.right)) + 1;
    }
//    public static Node createTree(){          // or do this
//        Node root;
//
//        System.out.print("enter data: ");
//        int data = sc.nextInt();
//
//        if(data == -1){
//            return null;
//        }
//        root = new Node(data);
//        System.out.println("enter left for " + data );
//        root.left = createTree();
//
//        System.out.println("enter right for " + data);
//        root.right = createTree();
//
//        return root;
//    }
}
