package arrays;

import java.util.Arrays;

public class MinimizeHeight {
    // https://practice.geeksforgeeks.org/problems/minimize-the-heights3351/1
    // either question is wrong or code is wrong...
    public static void main(String[] args) {
        int[] arr = {2,6,3,4,7,2,10,3,2,1};

        System.out.println(height(arr,5));
    }
    public static int height(int[] arr, int k){
        int[] ans = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            if(arr[i] >= k){
                ans[i] = arr[i] - k;
            } else {
                ans[i] = arr[i] + k;
            }
        }
        System.out.println(Arrays.toString(ans));
        Arrays.sort(ans);
        System.out.println(Arrays.toString(ans));
        return ans[ans.length-1] - ans[ans.length-2];
    }
}
