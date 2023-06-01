package BinarySearch;

public class SplitArrayLargestSum {
    public static void main(String[] args) {
        int[] arr = {7,2,5,10,8};

        System.out.println(splitArray(arr,2));
    }
    public static int splitArray(int[] nums, int m) {
        int low = max(nums);
        int high = sum(nums);
        int res = 0;

        while(low <= high){
            int mid = low + (high - low) / 2;

            if(isValid(nums, mid, m)){
                res = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return res;
    }
    public static boolean isValid(int[] arr, int mid, int k){
        int count = 1;
        int sum = 0;
        for(int i : arr){
            sum += i;
            if(sum > mid){
                count++;
                sum = i;
            }
        }
        return count <= k;
    }
    public static int max(int[] arr){
        int max = arr[0];

        for(int i=1; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public static int sum(int[] arr){
        int sum = 0;

        for (int i : arr) {
            sum += i;
        }
        return sum;
    }
}
