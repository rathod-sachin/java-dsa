package binaryTree;

import java.util.ArrayList;
import static binaryTree.Tree.createTree;

public class LeftView {
    public static void main(String[] args) {
        Node root = createTree();
        printLeftView(root);
    }
    public static void printLeftView(Node root){
        ArrayList<Node> list = new ArrayList<>();

        leftView(root, list, 0);

        for(Node node : list){
            System.out.print(node.data + " ");
        }
    }

    public static void leftView(Node root, ArrayList<Node> list, int level) {
        if(root == null){
            return;
        }
        if(level == list.size()){
            list.add(root);
        }
        leftView(root.left, list, level + 1);
        leftView(root.right, list, level + 1 );
    }
}
