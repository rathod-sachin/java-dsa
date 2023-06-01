package arrays;

import java.util.Arrays;

public class ThreeSumClosest {
    // 16
    public static void main(String[] args) {
        int[] arr1 = {-1,2,1,-4};

        System.out.println(closest(arr1, 1));
    }
    public static int closest(int[] arr, int tar){
        Arrays.sort(arr);
        int minDiff = Integer.MAX_VALUE;
        int res = -1;

        for(int k=0; k<arr.length; k++){
            int i = k + 1;
            int j = arr.length - 1;

            while (i<j){
                int sum = arr[i] + arr[j] + arr[k];
                int diff = Math.abs(sum - tar);

                if (diff < minDiff){
                    minDiff = diff;
                    res = sum;
                }
                if (sum == tar){
                    return sum;
                } else if (sum > tar){
                    j--;
                } else {
                    i++;
                }
            }
        }
        return res;
    }
}
