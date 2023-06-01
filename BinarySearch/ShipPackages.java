package BinarySearch;

public class ShipPackages {
    // 1011
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,1};

        System.out.println(shipWithinDays(arr,5));
    }
    public static int shipWithinDays(int[] weights, int days) {
        int low = max(weights);
        int high = sum(weights);
        int res = 0;

        while(low <= high){
            int mid = low + (high - low) / 2;

            if(isValid(weights, days, mid)){
                res = mid;
                high = mid - 1;
            } else{
                low = mid + 1;
            }
        }
        return res;
    }
    public static boolean isValid(int[] arr, int k, int mid){
        int countShip = 1;
        int sum = 0;

        for(int i : arr){
         //   sum += i; // if you want sum before if condition
            if(sum > mid){
                countShip++;
                sum = 0; // then sum = i;
            }
            sum += i;
        }
        return countShip <= k;
    }
    public static int sum(int[] arr){
        int sum = 0;

        for (int i : arr) {
            sum += i;
        }
        return sum;
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
}