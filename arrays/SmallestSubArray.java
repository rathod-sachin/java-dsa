package arrays;

public class SmallestSubArray {
    // https://www.geeksforgeeks.org/minimum-length-subarray-sum-greater-given-value/
    // 209 - leetcode
    public static void main(String[] args) {
        int[] arr = {1, 4, 45, 6, 0, 19};
        int x = 51;

        System.out.println(subArray(arr,x));
    }
    public static int subArray(int[] nums, int target){
        int s = 0;
        int e = 0;
        int sum = 0;
        int minLength = nums.length+1;

        while (e < nums.length){

            while (sum <= target && e < nums.length){ // if question is sum is greater or equal = (sum < target && e < nums.length)
                sum = sum + nums[e++];
            }

            while (sum > target && s < nums.length){ // if ques is sum is greater or equal = sum >= target && s < nums.length

                if(e - s < minLength){
                    minLength = e - s;
                }
                sum = sum - nums[s++];
            }
        }
        if(minLength == nums.length+1){
            return 0;
        }
        return minLength;
    }
}
