package arrays;

public class KthMissingPositiveNumber {
    // 1539
    public static void main(String[] args) {
        int[] arr = {4,7,11,15};

        System.out.println(missingPositive(arr,5));
    }
    public static int missingPositive(int[] arr, int k){
        for(int i : arr){
            if(i <= k){
                k++;
            } else {
                break;
            }
        }
        return k;
    }
}
