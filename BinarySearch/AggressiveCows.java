package BinarySearch;

import java.util.Arrays;

public class AggressiveCows {
    // https://www.codingninjas.com/codestudio/problems/aggressive-cows_1082559
    public static void main(String[] args) {
        int[] arr = {1,2,4,8,9};

        System.out.println(cows(arr, 3));
    }
    public static int cows(int[] arr, int k){
        Arrays.sort(arr);
        int low = 1;
        int high = arr[arr.length-1] - arr[0];
        int res = 0;

        while (low <= high){
            int mid = low + (high - low) / 2;

            if(isValid(arr, mid, k)){
                res = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return res;
    }
    public static boolean isValid(int[] arr, int mid, int k){
        int position = arr[0];
        int countCow = 1;

        for(int i=1; i<arr.length; i++){
            if(arr[i] - position >= mid){
                countCow++;
                if(countCow == k){
                    return true;
                }
                position = arr[i];
            }
        }
        return false;
    }
}
