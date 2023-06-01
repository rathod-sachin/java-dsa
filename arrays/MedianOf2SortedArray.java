package arrays;

public class MedianOf2SortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1,7,8};
        int[] arr2 = {3,4,6};

        System.out.println(findMedianSortedArrays(arr1, arr2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] ans = merge(nums1, nums2);
        int mid = (ans.length-1) / 2;

        if(ans.length % 2 == 0){
            return (double) ( ans[mid] + ans[(mid+1)]) / 2;
        } else {
            return (double) ans[mid];
        }
    }
    public static int[] merge(int[] arr1, int[] arr2){
        int[] ans = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length){
            if(arr1[i] <= arr2[j]){
                ans[k++] = arr1[i++];
            } else {
                ans[k++] = arr2[j++];
            }
        }
        while (i < arr1.length){
            ans[k++] = arr1[i++];
        }
        while (j < arr2.length){
            ans[k++] = arr2[j++];
        }
        return ans;
    }
}
