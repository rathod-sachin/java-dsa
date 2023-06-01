package hash;

import java.util.Arrays;
import java.util.HashMap;

public class SubArrayGivenSum {
    public static void main(String[] args) {
        int[] arr = {1, 4, 20, 3, 10, 5};

        System.out.println(Arrays.toString(subArray(arr, 3355)));
    }
    public static int[] subArray(int[] arr, int tar){
        int currSum = 0;
        int start = 0;
        int end = -1;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<arr.length; i++){
            currSum += arr[i];

            if(currSum - tar == 0){
                end = i;
                break;
            }
            if(map.containsKey(currSum - tar)){
                start = map.get(currSum - tar) + 1;
                end = i;
                break;
            }
            map.put(currSum, i);
        }
        if(end == -1){
            return new int[]{-1,-1};
        }
        return new int[]{start, end};
    }
}
