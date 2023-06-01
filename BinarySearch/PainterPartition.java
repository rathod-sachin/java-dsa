package BinarySearch;

public class PainterPartition {
    // https://www.geeksforgeeks.org/painters-partition-problem/
    // check code where to use int and long
    public static void main(String[] args) {
        int[] arr = {1,8,11,3};

        System.out.println(partition(arr, 5));
    }
    public static long partition(int[] arr, int k){

        long min = min(arr);
        long max = max(arr);
        long ans = 0;

        while (min <= max){
            long mid = min + (max - min) / 2;

            if(isValid(arr, mid, k)){
                ans = mid;
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        return ans;
    }
    public static boolean isValid(int[] arr, long mid, int k){
        long painter = 1;
        long board = 0;

        for (int j : arr) {
            board += j;
            if (board > mid) {
                painter++;
                board = j;
            }
        }
        return painter <= k;
    }
    public static long max(int[] arr){
        long sum = 0;

        for(int i : arr){
            sum += i;
        }
        return sum;
    }
    public static int min(int[] arr){
        int max = arr[0];

        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }
}
