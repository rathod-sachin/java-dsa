package binaryTree;

import java.util.ArrayList;

import static binaryTree.Tree.createTree;

public class RightView {
    public static void main(String[] args) {
        Node root = createTree();

        printRightView(root);
    }
    public static void printRightView(Node root){
        ArrayList<Node> list = new ArrayList<>();

        rightView(root, list, 0);

        for(Node node : list){
            System.out.print(node.data + " ");
        }
    }

    private static void rightView(Node root, ArrayList<Node> list, int level) {
        if(root == null){
            return;
        }
        if (level == list.size()){
            list.add(root);
        }
        rightView(root.right, list, level + 1);
        rightView(root.left, list, level + 1);
    }
}
