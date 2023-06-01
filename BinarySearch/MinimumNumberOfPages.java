package BinarySearch;

public class MinimumNumberOfPages {
    // https://www.geeksforgeeks.org/allocate-minimum-number-pages/
    // VVVV IMP

//    Related Problems For Practice :
//    Book Allocation Problem (GFG)
//    Aggressive cow (spoj)
//    Prata and roti (spoj)
//    EKO (spoj)
//    Google kickstart A Q-3 2020

//    1482 Minimum Number of Days to Make m Bouquets
//1283 Find the Smallest Divisor Given a Threshold
//1231 Divide Chocolate
//1011 Capacity To Ship Packages In N Days
//875 Koko Eating Bananas
//            Minimize
//774 Max Distance to Gas Station
//410 Split Array Largest Sum

    public static void main(String[] args) {
        int[] arr = {12,34,67,90};

        System.out.println(findPages(arr, 2));
    }
    public static int findPages(int[]arr, int k) {
        int n = arr.length;
        if(k > n){
            return -1;
        }
        int min = max(arr);
        int max = sum(arr);
        int result = 0;

        while (min <= max){
            int mid = min + (max - min) / 2;

            if(isValid(arr, n, k, mid)){
                result = mid;
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        return result;
    }

    private static boolean isValid(int[] arr, int n, int k, int mid) {
        int student = 1;
        int sum = 0;

        for(int i=0; i<n; i++){
            sum += arr[i];
            if(sum > mid){
                student++;
                sum = arr[i];
            }
        }
        return student <= k;
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
