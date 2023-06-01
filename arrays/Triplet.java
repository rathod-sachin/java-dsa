package arrays;

import java.util.Arrays;

public class Triplet {
    public static void main(String[] args) {
        int[] arr = {12, 3, 4, 1, 6, 9};

        System.out.println(triplet(arr,27));
    }
    public static boolean triplet(int[] arr, int tar){
        Arrays.sort(arr);

        for(int i=0; i<arr.length; i++){
            int j = i + 1;
            int k = arr.length - 1;

            while (j<k){
                if(arr[i] + arr[j] + arr[k] == tar){
                    return true;
                } else if (arr[i] + arr[j] + arr[k] > tar) {
                    k--;
                } else {
                    j++;
                }
            }
        }
        return false;
    }
}
