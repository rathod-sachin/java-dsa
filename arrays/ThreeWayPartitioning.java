package arrays;

import java.util.Arrays;

public class ThreeWayPartitioning {
    public static void main(String[] args) {
        // wrong code
        int[] arr = {6,9,11,3,8,5,19,21};

        part(arr,7,12);

        System.out.println(Arrays.toString(arr));
    }

    public static void part(int[] arr, int low, int high) {
        int start  = 0;
        int end = arr.length-1;
        int i= 0;

        while (i<=end){

            if(arr[i] > high){
                int temp = arr[i];
                arr[i] = arr[end];
                end--;
                i--;
            } else if (arr[i] < low) {
                int temp = arr[i];
                arr[i] = arr[start];
                start++;
            } else if (arr[i] > low && arr[i] < high) {
                i++;
            }
        }
    }
}
