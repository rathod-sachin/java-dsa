package sorting;

import java.util.Arrays;

public class ThreeInOne {
    public static void main(String[] args) {
        int[] nums = {-34,-12,0,5,8,3,9,-5};
        insertion(nums);
        System.out.println(Arrays.toString(nums));
        bubble(nums);
        System.out.println(Arrays.toString(nums));
        selection(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void insertion(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j>0; j--){
                if(arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                } else {
                    break;
                }
            }
        }
    }
    static void selection(int[] arr){

        for(int i=0; i<arr.length; i++){
            int last = arr.length - i - 1;
            int maxIndex = max(arr, 0, last);

            swap(arr, maxIndex, last);
        }
    }

    static void bubble(int[] arr) {
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j-1);
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    static int max(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }
}