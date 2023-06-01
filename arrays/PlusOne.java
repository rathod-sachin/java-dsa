package arrays;

import java.util.Arrays;

public class PlusOne {
    // 66
    public static void main(String[] args) {
        int[] arr = {9,9,9};

        System.out.println(Arrays.toString(plusOne(arr)));
    }
    public static int[] plusOne(int[] digits){
        for(int i=digits.length-1; i>=0; i--){

            if(digits[i] != 9){
                digits[i]++;
                break;
            } else {
                digits[i] = 0;
            }
        }
        if(digits[0] == 0){
            int[] ans = new int[digits.length + 1];
            ans[0] = 1;
            return ans;
        }
        return digits;
    }
}
