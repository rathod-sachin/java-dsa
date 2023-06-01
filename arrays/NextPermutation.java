package arrays;

import java.util.Arrays;

public class NextPermutation {
    // 31
    public static void main(String[] args) {
        int[] arr = {3,5,2,7};
        nextPermutation(arr);

        System.out.println(Arrays.toString(arr));
    }
    public static void nextPermutation(int[] nums){
        if (nums.length <= 1){
            return;
        }
        int i = nums.length - 2;
        while (i >= 0 && nums[i] >= nums[i+1]){
            i--;
        }
        if (i >= 0){
            int j = nums.length - 1;
            while (nums[j] <= nums[i]){
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums, i+1, nums.length - 1);
    }
    private static void reverse(int[] arr, int i, int j) {
        while (i < j){
            swap(arr, i++, j--);
        }
    }
    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
