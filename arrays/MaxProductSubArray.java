package arrays;

public class MaxProductSubArray {
    // https://practice.geeksforgeeks.org/problems/maximum-product-subarray3604/1
    // 152 = leetcode
    public static void main(String[] args) {
        int[] arr = {2,-3,6,-1,-4,0,-2};

        System.out.println(product(arr));
    }
    public static int product(int[] nums){
        int ans = Integer.MIN_VALUE;
        int m = 1;

        for(int i=0; i<nums.length; i++){
            m *= nums[i];
            ans = Math.max(m, ans);
            if(m==0){
                m=1;
            }
        }
        int n = 1;
        for(int i=nums.length-1; i>=0; i--){
            n *= nums[i];
            ans = Math.max(n, ans);
            if(n==0){
                n = 1;
            }
        }
        return ans;
    }
}
