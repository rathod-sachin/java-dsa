package arrays;

public class KadaneSAlgorithm {
    // https://practice.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1
    // 53
    // OR maximum subArray
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSum(arr));
    }
    public static int maxSum(int[] arr){
        int maxSum = arr[0];
        int currSum = 0;

        for(int i=0; i<arr.length; i++){
            currSum += arr[i];

            if(currSum > maxSum){
                maxSum = currSum;
            }
            if(currSum < 0){
                currSum = 0;
            }
        }
        return maxSum;
    }
}
