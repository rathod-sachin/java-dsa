package arrays;

import java.util.HashMap;

public class SubSetOfAnotherArray {
    // https://practice.geeksforgeeks.org/problems/array-subset-of-another-array2317/1
    public static void main(String[] args) {

        int[] arr = {11, 1, 13, 21, 3, 7};
        int[] a2 = {3, 1, 21};

        System.out.println(isSubset(arr, a2));
    }
    public static boolean isSubset(int[] arr1, int[] arr2){
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<arr1.length; i++){
            map.put(arr1[i], map.getOrDefault(arr1[i], 0)+1);
        }

        for(int i=0; i<arr2.length; i++){
            if (map.getOrDefault(arr2[i], 0) > 0){
                map.put(arr2[i], map.get(arr2[i])-1);
            } else {
                return false;
            }
        }
        return true;
    }
}
