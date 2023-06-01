package arrays;

public class MaxSubArray {
    // https://practice.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1
    // 53
    // OR maximum subArray
    // question is we have to find the max sum of any subArray
    public static void main(String[] args) {
        int[] arr = {-2,-3,4,-1,-2,1,5,-3}; // here 4,-1,-2,1,5 = 7. so this is our answer
        System.out.println(maxSum(arr));
    }

    public static int maxSum(int[] arr) {
        int maxSum = arr[0];
        int sum = 0;

        for(int i=0; i<arr.length; i++){
            sum += arr[i];

            if(sum > maxSum){
                maxSum = sum;
            }
            if(sum < 0){
                sum = 0;
            }
        }
        return maxSum;
    }
}
