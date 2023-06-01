package BinarySearch;

public class EKO {
    // https://www.spoj.com/problems/EKO/
    public static void main(String[] args) {
        int[] arr = {4,6,8,10};

        System.out.println(eKO(arr, 3));
    }
    public static int eKO(int[] arr, int k){
        int low = min(arr);
        int high = max(arr);
        int res = 0;

        while (low <= high){
            int mid = low + (high - low) / 2;

            if(isValid(arr, mid, k)){
                res = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return res;
    }
    public static boolean isValid(int[] arr, int mid, int k){
        int sum = 0;

        for (int j : arr) {
            if (j > mid) {
                sum += j - mid;
            }
        }
        return sum >= k;
    }
    public static int min(int[] arr){
        int min = arr[0];

        for(int i : arr){
            if(i < min){
                min = i;
            }
        }
        return min;
    }
    public static int max(int[] arr){
        int max = arr[0];

        for(int i : arr){
            if(i > max){
                max = i;
            }
        }
        return max;
    }
}
