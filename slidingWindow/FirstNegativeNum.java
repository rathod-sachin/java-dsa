package slidingWindow;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class FirstNegativeNum {
    public static void main(String[] args) {
        int[] arr = {12, -1, -7, 8, -15, 30, 16, 28};

        System.out.println(Arrays.toString(subArray(arr,3)));
    }
    public static long[] subArray(int[] arr, int k) {
        int i = 0;
        int j = 0;

        Deque<Integer> deque = new LinkedList<>();
        long[] ans = new long[arr.length - k + 1];

        while(j < arr.length){
            if(arr[j] < 0){
                deque.add(j);
            }
            if(j - i + 1 == k){
                if(!deque.isEmpty() && deque.getFirst() < i){
                    deque.removeFirst();
                }
                if(deque.isEmpty()){
                    ans[i] = 0;
                }
                else{
                    ans[i] = arr[deque.getFirst()];
                }
                i++;
            }
            j++;
        }
        return ans;
    }
}