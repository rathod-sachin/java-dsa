package arrays;

public class SingleNumber {
    public static void main(String[] args) {
        int[] arr = {0,4,2,0,2};

        System.out.println(singleNumber(arr));
    }
    public static int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result = result ^ num;
        }
        return result;
    }
}
