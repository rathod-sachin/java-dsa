package recursion;

import java.util.ArrayList;

public class ArraySort {
    //array is sorted or not
    public static void main(String[] args) {
        int[] arr = {2,3,1,5,3,4,7,8,9,3};
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(sort(arr, 3,0, list));
    }
    public static ArrayList<Integer> sort(int[] arr, int tar, int index, ArrayList<Integer> list) {

        if(index == arr.length){
            return list;
        }
        if(arr[index] == tar){
            list.add(index);
        }
        return sort(arr, tar, index+1, list);
    }
}
