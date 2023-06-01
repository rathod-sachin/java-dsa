package arrBi2D;

import java.util.Arrays;
// 189

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {8,6,4,5,3,1,4,5,9,0};
        int k = 5;

        rotate(arr, k);
        System.out.println(Arrays.toString(arr));
    }

    static public void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);
    }
    static void reverse(int[] arr, int start, int end){

        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
