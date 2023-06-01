package arrays;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    // 1
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};

        System.out.println(Arrays.toString(twoSum(arr, 9)));
    }
    public static int[] twoSum(int[] arr, int k){
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[2];

        for(int i=0; i<arr.length; i++){
            if(!map.containsKey(arr[i])){
                map.put(k - arr[i], i);
            } else {
                ans[0] = map.get(arr[i]);
                ans[1] = i;
                break;
            }
        }
        return ans;
    }
}