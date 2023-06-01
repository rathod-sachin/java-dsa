package BinarySearch;

public class Threshold {
    // 1283
    public static void main(String[] args) {
        int[] arr = {1,2,5,9};

        System.out.println(smallestDivisor(arr,6));
    }
    public static int smallestDivisor(int[] nums, int threshold){
        int low = 1;
        int high = getMax(nums);
        int res = 0;
        while (low <= high){
            int mid = low + (high - low) / 2;

            if(isValid(nums, threshold, mid)){
                res = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return res;
    }
    public static boolean isValid(int[] arr, int k, int divisor){ // here k is threshold and divisor is mid
        int sum = 0;

        for(int i : arr){
            sum += i / divisor;
            if(i % divisor != 0){
                sum += 1;
            }
        }
        return sum <= k;
    }
    public static int getMax(int[] arr) {
        int max = arr[0];

        for(int i=1; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}