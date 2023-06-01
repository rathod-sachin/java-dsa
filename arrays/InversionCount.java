package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class InversionCount {
    public static void main(String[] args) {
        int[] arr = {2,4,1,3,5};

        System.out.println(inversion(arr));
    }
    public static int inversion(int[] nums){
        int count = 0;
        int i = 0;
        int j;

        while (i<nums.length) {
            j = i + 1;

            while (j < nums.length) {
                if (nums[i] > nums[j]) {
                    count++;
                    j++;
                } else {
                    j++;
                }
            }
            i++;
        }
        return count;
    }
}
