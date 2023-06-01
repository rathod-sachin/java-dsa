package searchingAndSorting;

import java.util.Arrays;

public class Triplet {
    // https://practice.geeksforgeeks.org/problems/count-triplets-with-sum-smaller-than-x5549/1

    public static void main(String[] args) {
        int[] arr = {5, 1, 3, 4, 7};

        System.out.println(threeSum(arr,12));
    }
    public static long threeSum(int[] arr, int sum) {
        Arrays.sort(arr);
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int j = i + 1;
            int k = arr.length - 1;
            while (j < k) {
                if (arr[i] + arr[j] + arr[k] >= sum) {
                    k--;
                } else {
                    // This is important. For current i and j, there
                    // can be total k-j third elements.
                    count += k - j;
                    j++;
                }
            }
        }
        return count;
    }
}
