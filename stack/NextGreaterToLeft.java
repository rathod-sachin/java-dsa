package stack;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterToLeft {
    public static void main(String[] args) {
        int[] arr = {2,7,2,4,0,3,1};

        System.out.println(Arrays.toString(larger(arr)));
    }
    public static int[] larger(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        int k = 0;
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<n; i++){
            while (!stack.isEmpty() && stack.peek() <= arr[i]){
                stack.pop();
            }
            if (stack.isEmpty()){
               ans[k++] = -1;
            } else {
                ans[k++] = stack.peek();
            }
            stack.push(arr[i]);
        }
        return ans;
    }
}