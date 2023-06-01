package BinarySearch;

public class KokoEatingBananas {
    // 875

    public static void main(String[] args) {
        int[] arr = {805306368,805306368,805306368};

        System.out.println(minEatingBananas(arr,1000000000));

    }
    public static int minEatingBananas(int[] piles, int h){
        int low = 1;
        int high = max(piles);

        while (low < high){ // here low will smaller than high not =
            int mid = low + (high - low) / 2;

            if(isValid(piles, mid, h)){
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low; // return low
    }
    public static boolean isValid(int[] arr, int k, int h){
        int countHours = 0;

        for(int i : arr){
            int div = i / k;
            countHours += div;
            if(i % k != 0){
                countHours++;
            }
        }
        return countHours <= h;
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
