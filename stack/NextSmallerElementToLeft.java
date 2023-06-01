package stack;

import java.util.Arrays;
import java.util.Stack;

public class NextSmallerElementToLeft {
    public static void main(String[] args) {
        int[] arr = {6,2,5,4,5,1,6};

        System.out.println(Arrays.toString(nextSmaller(arr)));
    }
    public static int[] nextSmaller(int[] arr){
        int n = arr.length;
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[n];

        for(int i=0; i<n; i++){
            while (!stack.isEmpty() && stack.peek() >= arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                ans[i] = -1;
            } else {
                ans[i] = stack.peek();
            }
            stack.add(arr[i]);
        }
        return ans;
    }
}
