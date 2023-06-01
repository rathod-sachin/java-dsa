package recursion;

import java.util.Arrays;

public class MergeSortUsingRecursion {
    // 912
    public static void main(String[] args) {
        int[] arr = {5,9,8,1};
        int[] ans = mergeSort(arr);

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(ans));
    }
    public static int[] mergeSort(int[] arr){
        if(arr.length == 1){ // arr.length < 2
            return arr;
        }
        int mid = arr.length / 2;

        int[] first = mergeSort(Arrays.copyOfRange(arr,0, mid));
        int[] second = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(first, second);
    }
    public static int[] merge(int[] first, int[] second){
        int[] mix = new int[first.length + second.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i<first.length && j<second.length){
            if(first[i] < second[j]){
                mix[k++] = first[i++];
            } else {
                mix[k++] = second[j++];
            }
        }
        while (i< first.length){
            mix[k++] = first[i++];
        }
        while (j< second.length){
            mix[k++] = second[j++];
        }
        return mix;
    }
}
