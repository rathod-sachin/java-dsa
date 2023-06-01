package stack;

import java.util.Stack;

public class InBuiltExamples {
    public static void main(String[] args) {
        Stack<Integer> list = new Stack<>();
        list.add(2);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(9);
        list.add(12);

        System.out.println(list);
        list.pop();
        System.out.println(list);
        list.push(34);
        System.out.println(list);
        list.add(1,45);
        System.out.println(list);
        System.out.println(list.empty());
        System.out.println(list.isEmpty());
        System.out.println(list.peek());
        System.out.println(list.search(2));
    }
}