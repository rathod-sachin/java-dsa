package hash;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class CountDistinctElement {
    public static void main(String[] args) {
        int[] arr = {5,10,15,5,45};

    }
    public static int element(int[] arr1, int[] arr2){
        Set<Integer> list = new HashSet<>();
        int i = 0;
        int count = 0;

        while ( i < arr1.length){
           list.add(arr1[i]);
           i++;
        }
//        for(int ele : arr){
//            list.add(ele);
//        }
        return list.size();
    }
}



//     O(n^2)
//    public static int element(int[] arr){
//        int i = 0;
//        int count = 0;
//
//        while (i<arr.length){
//            for(int j=0; j<=i; j++){
//                if(i==j){
//                    count++;
//                }
//                if(arr[j] == arr[i]){
//                    break;
//                }
//            }
//            i++;
//        }
//        return count;
//    }
