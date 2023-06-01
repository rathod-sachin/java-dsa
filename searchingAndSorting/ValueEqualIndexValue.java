package searchingAndSorting;

import java.util.ArrayList;

public class ValueEqualIndexValue {
    // https://practice.geeksforgeeks.org/problems/value-equal-to-index-value1330/1
    public static void main(String[] args) {
        int[] arr = {15,2,45,12,5,13,7};

        System.out.println(value(arr));
    }
    public static ArrayList<Integer> value(int[] arr){

        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i<arr.length; i++){
            if(arr[i] == i + 1){
                list.add(arr[i]);
            }
        }
        return list;
    }
}
