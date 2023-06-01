package stack;

import java.util.Arrays;
import java.util.Stack;

public class NextSmallerElement {
    public static void main(String[] args) {
        int[] arr = {4,3,0,2,12,3,6,2};

        System.out.println(Arrays.toString(nextSmaller(arr)));
    }
    public static int[] nextSmaller(int[] arr){
        int n = arr.length;
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[n];
        int k = n-1;

        for(int i=n-1; i>=0; i--){
            while (!stack.isEmpty() && stack.peek() >= arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                ans[k--] = -1;
            } else {
                ans[k--] = stack.peek();
            }
            stack.add(arr[i]);
        }
        return ans;
    }
}
