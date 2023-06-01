package arrBi2D;

public class KadaneAlgorithm {
    public static void main(String[] args) {
        int[] arr = {-1,-2,-3,-11};

        System.out.println(contiguousSubArray(arr));
    }
    public static int contiguousSubArray(int[] arr){
        int currSum = 0;
        int maxSum = arr[0];

        for (int j : arr) {
            currSum += j;

            if (currSum > maxSum) {
                maxSum = currSum;
            }
            if (currSum < 0) {
                currSum = 0;
            }
        }
        return maxSum;
    }
}