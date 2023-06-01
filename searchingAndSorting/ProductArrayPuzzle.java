package searchingAndSorting;

import java.util.Arrays;

public class ProductArrayPuzzle {
    public static void main(String[] args) {
        int[] arr = {5, 2, 4, 1, 3};
        System.out.println(Arrays.toString(puzzle(arr)));
    }

    public static long[] puzzle(int[] nums) {
        long[] list = new long[nums.length];
        int i = 0;

        while (i < nums.length) {
            int product = 1;
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    product = product * nums[j];
                }
            }
            list[i] = product;
            i++;
        }
        return list;
    }
}