package BinarySearch;

public class PrataRoti {
    // https://www.spoj.com/problems/PRATA/
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};

        System.out.println(parathaRoti(arr, 10));
    }
    public static int parathaRoti(int[] arr, int k){
        int low = 0;
        int high = Integer.MAX_VALUE;
        int ans = 0;

        while (low <= high){
            int mid = low + (high - low) / 2;

            if(isValid(arr, mid, k)){
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
    public static boolean isValid(int[] arr, int mid, int k){
        int paratha = 0;
        int time = 0;

        for(int i=0; i<arr.length; i++){
            time = arr[i];
            int j = 2;
            while (time <= mid){
                paratha++;
                time = time + (arr[i] * j);
                j++;
            }
        }
        if(paratha >= k){
            return true;
        }
        return false;
    }
}
