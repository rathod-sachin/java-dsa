package stack;

import java.util.Arrays;
import java.util.Stack;

public class StockSpan {
    // https://practice.geeksforgeeks.org/problems/stock-span-problem-1587115621/1#
    public static void main(String[] args) {
        int[] ans = {10, 3, 4, 5, 90, 120, 80};

        System.out.println(Arrays.toString(calculateSpan(ans)));
    }
    public static int[] calculateSpan(int[] arr){
        int n = arr.length;
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[n];

        for(int i=0; i<n; i++){
            while (!stack.isEmpty() && arr[stack.peek()] <= arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                ans[i] = i-(-1);
            } else {
                ans[i] = i - stack.peek();
            }
            stack.add(i);
        }
        return ans;
    }
}
