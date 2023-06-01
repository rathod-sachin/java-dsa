package cyclicSort;

import java.util.ArrayList;

public class AllDuplicates {
    public static void main(String[] args) {


    }

    static ArrayList<Integer> sort(int[] nums){
        int i=0;
        while(i<nums.length){
            int corr = nums[i]-1;
            if(nums[i] != nums[corr]){
                swap(nums, i, corr);
            } else {
                i++;
            }
        }

        ArrayList<Integer> List = new ArrayList<>();

        for(int index = 0; index<nums.length; index++ ){
            if(nums[index] != index + 1){
                List.add(index+1);
            }
        }
        return List;
    }
    static void swap(int[]arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
