package stack;

import java.util.Stack;

public class MinElementInStack {
    Stack<Integer> stack1;
    Stack<Integer> stack2;

    MinElementInStack(){
        this.stack1 = new Stack<>();
        this.stack2 = new Stack<>();
    }
    public static void main(String[] args) {
        MinElementInStack stack = new MinElementInStack();
        stack.push(5);
        stack.push(9);
        stack.pop();
        stack.push(2);
        stack.push(8);
        System.out.println(stack.getMin());

    }
    public void push(int n){
        stack1.push(n);
        if(stack2.isEmpty() || n <= stack2.peek()){
            stack2.push(n);
        }
    }
    public int pop(){
        if (stack1.isEmpty()){
            return -1;
        }
        stack1.pop();
        int ans = stack1.pop();
        if(ans == stack2.peek()){
            stack2.pop();
        }
        return ans;
    }
    public int getMin(){
        if(stack2.isEmpty()){
            return -1;
        }
        return stack2.peek();
    }
}
