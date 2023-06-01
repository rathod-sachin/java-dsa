package binaryTree;

import static binaryTree.Tree.createTree;
import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
    public static void main(String[] args) {
        Node root = createTree();
        levelOrder(root);
    }
    public static void levelOrder(Node root){
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
//        queue.add(null);

        while (!queue.isEmpty()){
            Node curr = queue.remove();

//            if(curr == null){
//                if(queue.isEmpty()){              if want to print like this :
//                    return;                        3 4
//                }                                  7 8 9
//                queue.add(null);                   5 5
//                System.out.println();              7      then use this
//                continue;
//            }

            System.out.print(curr.data + " ");

            if(curr.left != null){
                queue.add(curr.left);
            }
            if(curr.right != null){
                queue.add(curr.right);
            }
        }
    }
}
