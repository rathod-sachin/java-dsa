package arrays;

import java.util.Arrays;
import java.util.HashMap;

public class CountPairWithGivenSum {
    // https://practice.geeksforgeeks.org/problems/count-pairs-with-given-sum5022/1
    public static void main(String[] args) {
        int[] arr = {1,1,1,1};

        System.out.println(pair(arr, 2));
    }
    public static int pair(int[] arr, int k){
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i] < k){
                int value = k - arr[i];

                if(map.containsKey(value)){
                    count += map.get(value);
                }
                map.putIfAbsent(arr[i], 0);
                map.put(arr[i], map.get(arr[i])+1);
            }
        }
        return count;
    }
}
