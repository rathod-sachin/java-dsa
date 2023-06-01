package stack;

import java.util.Stack;

public class Histogram2D {
    public static void main(String[] args) {
        char[][] arr = {{'1'}};

        System.out.println(maxArea(arr));
    }

    public static int maxArea(char[][] matrix){
        int n = matrix.length;
        int m = matrix[0].length;
        int[] temp = new int[n];
        int max = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(matrix[i][j] == '0'){
                    temp[j] = 0;
                } else {
                     temp[j] = temp[j] + matrix[i][j];
                }
            }
            max = Math.max(max, mah(temp));
        }
        return max;
    }
    public static int mah(int[] arr){
        int n = arr.length;
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        int[] left = new int[n];
        for(int i=0; i<n; i++){
            while (!stack1.isEmpty() && arr[stack1.peek()] >= arr[i]){
                stack1.pop();
            }
            if (stack1.isEmpty()){
                left[i] = -1;
            } else {
                left[i] = stack1.peek();
            }
            stack1.push(i);
        }

        int[] right = new int[n];
        int k = n - 1;
        for(int i=n-1; i>=0; i--) {
            while (!stack2.isEmpty() && arr[stack2.peek()] >= arr[i]) {
                stack2.pop();
            }
            if (stack2.isEmpty()) {
                right[k--] = n;
            } else {
                right[k--] = stack2.peek();
            }
            stack2.push(i);
        }

        int[] width = new int[n];
        int area = 0;

        for(int i=0; i<n; i++){
            width[i] = (right[i] - left[i]) - 1;
            area = Math.max(area, (arr[i] * width[i]));
        }
        return area;
    }
}
