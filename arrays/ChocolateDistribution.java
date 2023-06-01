package arrays;

import java.util.Arrays;

public class ChocolateDistribution {
    // https://practice.geeksforgeeks.org/problems/chocolate-distribution-problem3825/1

    public static void main(String[] args) {
        int[] arr = {7, 3, 2, 4, 9, 12, 56};

        System.out.println(chocolate(arr, 3));
    }
    public static int chocolate(int[] arr, int m){
        bubble(arr);

        long minDiff = Integer.MAX_VALUE;
        long diff = 0;

        for(int i=0; i+m-1 < arr.length; i++){

            diff = arr[i+m-1] - arr[i];

            if(diff < minDiff){
                minDiff = diff;
            }
        }
        return (int) minDiff;
    }

    public static void bubble(int[] arr){

        boolean swapped;
        for(int i=0; i<arr.length; i++){
            swapped = false;
            for(int j=1; j<arr.length-i; j++){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
}
