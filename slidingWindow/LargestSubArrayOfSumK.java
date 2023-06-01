package slidingWindow;

public class LargestSubArrayOfSumK {
    public static void main(String[] args) {
        int[] arr = {4,1,1,1,2,3,5};

        System.out.println(maxSubArray(arr,9));
    }
    public static int maxSubArray(int[] arr, int k){
        int i = 0;
        int j = 0;
        int max = 0;
        int sum = 0;

        while ( j < arr.length){
            sum += arr[j];

            if(sum < k){
                j++;
            } else if (sum == k) {
                max = Math.max(sum, max);
                j++;
            } else {
                while (sum > k) {
                    sum -= arr[i];
                    i++;
                    j++;
                }
            }
        }
        return max;
    }
}
