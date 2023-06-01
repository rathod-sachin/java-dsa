package searchingAndSorting;

import java.util.Arrays;

public class PairDifference {
    // https://www.geeksforgeeks.org/find-a-pair-with-the-given-difference/

    public static void main(String[] args) {
        int[] arr = {2,3,5,10,50,80};
        int tar = 60;

        System.out.println(Arrays.toString(pair(arr,tar)));
    }
    public static int[] pair(int[] arr, int tar){
        Arrays.sort(arr);

        int i = 0;
        int j = 1;

        while (i<arr.length && j<arr.length){

            if(i != j && arr[i] - arr[j] == tar || arr[j] - arr[i] == tar){
                return new int[]{i,j};
            } else if (arr[j] - arr[i] > tar) {
                i++;
            } else {
                j++;
            }
        }
        return new int[]{-1,-1};
    }
}
