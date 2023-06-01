package arrays;

import java.util.Arrays;

public class MoveZeroes {
    // 283
    public static void main(String[] args) {
        int[] arr = {3, 4, 0, 2, 0, 9, 4, 0};
        moveZeroes(arr);

        System.out.println(Arrays.toString(arr));
    }
    public static void moveZeroes(int[] nums) {
        int j = 0;
        for (int i=0; i<nums.length; i++){
            if (nums[i] != 0){
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }
        }
    }
}
//        int i = 0;
//        int j = 1;
//        while (j < nums.length){
//
//            if(nums[i] == 0 && nums[j] != 0){
//                swap(nums, i, j);
//            } else if (nums[i] == 0 && nums[j] == 0) {
//                j++;
//            } else {
//                i++;
//                j++;
//            }
//        }
//    }
//    public static void swap(int[] arr, int first, int second){
//        int temp = arr[first];
//        arr[first] = arr[second];
//        arr[second] = temp;
//    }
//}
