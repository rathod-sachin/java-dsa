package arrays;

public class MinSwaps {

    // https://www.geeksforgeeks.org/minimum-swaps-required-bring-elements-less-equal-k-together/
    public static void main(String[] args) {
        int[] arr = {2, 7, 9, 5, 8, 7, 4};
        int k = 5;

        System.out.println(swaps(arr, k));
    }
    public static int swaps(int[] arr, int k){
        int i=0;
        int j= arr.length-1;
        int count = 0;

        while (i<j){

            if(arr[i] > k && arr[j] <= k){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
                count++;
            } else if (arr[i] > k && arr[j] > k) {
                j--;
            } else if (arr[i] < k && arr[j] > k) {
                i++;
                j--;
            } else if (arr[i] < k && arr[j] <= k) {
                i++;
            }
        }
        return count;
    }
}
