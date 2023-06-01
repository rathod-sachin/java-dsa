package arrays;

import java.util.Arrays;

public class MergeSortedArray {
    // 88
    // https://leetcode.com/problems/merge-sorted-array/discuss/2120234/Visual-Explanation-or-O(1)-Space-JAVA
    public static void main(String[] args) {
        int[] arr1 = {1,4,6,0};
        int[] arr2 = {2,3,5};

        System.out.println(Arrays.toString(merge(arr1, 3, arr2, 3)));
    }
    public static int[] merge(int[] nums1, int m, int[] nums2, int n){
        int a = m - 1;
        int b = n - 1;
        int i = m + n - 1;

        while ( b >= 0 ){

            if( a >= 0 && nums1[a] > nums2[b]){
                nums1[i--] = nums1[a--];
            } else {
                nums1[i--] = nums2[b--];
            }
        }
        return nums1;
    }
}
