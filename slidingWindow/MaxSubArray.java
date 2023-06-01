package slidingWindow;

public class MaxSubArray {
    // max sum subArray with size k
    public static void main(String[] args) {

        int[] arr = {5,3,2,1,4,9};

        System.out.println(subArray(arr,3));
    }
    public static int subArray (int[] arr, int k){
        int i = 0;
        int j = 0;
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        while (j < arr.length){
            sum += arr[j];
            if(j - i + 1 < k){
                j++;
            } else if (j - i + 1 == k) {
                maxSum = Math.max(sum, maxSum);
                sum -= arr[i];
                i++;
                j++;
            }
        }
        return maxSum;
    }
}
