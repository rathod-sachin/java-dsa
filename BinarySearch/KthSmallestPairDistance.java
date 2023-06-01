package BinarySearch;

import java.util.Arrays;

public class KthSmallestPairDistance {
    // 719
    public static void main(String[] args) {
        int[] arr = {2,5,8,4};

        System.out.println(pairDistance(arr, 4));
    }
    public static int pairDistance(int[] nums, int k){
        Arrays.sort(nums);
        int start = 0;
        int end = nums[nums.length-1] - nums[0];

        while (start < end){
            int mid = start + (end - start) / 2;

            if(isValid(nums, mid, k)){
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
    public static boolean isValid(int[] arr, int mid, int k){
        int count = 0;
        int i = 0;

        for(int j=1; j<arr.length; j++){
            while (arr[j] - arr[i] > mid){
                i++;
            }
            count += j - i;
        }
        return count >= k;
    }
}
