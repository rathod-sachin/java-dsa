package stack;

import java.util.Stack;

// https://practice.geeksforgeeks.org/problems/get-minimum-element-from-stack/1

public class MinElementInStackConstantSpace {
    Stack<Integer> stack;
    int minEle;

    MinElementInStackConstantSpace() {
        this.stack = new Stack<>();
    }

    public static void main(String[] args) {
        MinElementInStackConstantSpace s = new MinElementInStackConstantSpace();

        s.push(12);
        s.push(13);
        s.push(3);
        s.push(17);
        s.pop();
        s.push(27);

        System.out.println(s.getMin());
        System.out.println(s.top());
    }

    public int getMin() {
        if (stack.isEmpty()) {
            return -1;
        }
        return minEle;
    }

    public void push(int x) {
        if (stack.isEmpty()) {
            stack.push(x);
            minEle = x;
        } else if (x >= minEle){
            stack.push(x);
            } else {
            stack.push((2 * x) - minEle);
            minEle = x;
        }
    }

    public void pop() {
   //     int min = 0; // or don't use this and make return type void
        if (stack.isEmpty()) {
            return;
        } else if(stack.peek() >= minEle){
            stack.pop();
            } else {
          //  min = minEle;
            minEle = (2 * minEle) - stack.pop();
        }
       // return min;
    }

    public int top() {
        if (stack.isEmpty()) {
            return -1;
        } else if (stack.peek() >= minEle) {
            return stack.peek();
        } else {
            return minEle;
        }
    }
}