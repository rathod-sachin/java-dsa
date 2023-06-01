package stack;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {
    // https://practice.geeksforgeeks.org/problems/next-larger-element-1587115620/1
    public static void main(String[] args) {
        int[] arr = {2,7,2,4,0,3,1};

        System.out.println(Arrays.toString(larger(arr)));
    }
    public static long[] larger(int[] arr){
        int n = arr.length;
        long[] ans = new long[n];
        int k = n - 1;
        Stack<Integer> stack = new Stack<>();

        for(int i=arr.length-1; i>=0; i--){
            while (!stack.isEmpty() && stack.peek() <= arr[i]){
                stack.pop();
            }
            if (stack.isEmpty()){
                ans[k--] = -1;
            } else {
                ans[k--] = stack.peek();
            }
            stack.push(arr[i]);
        }
        return ans;
    }
}
