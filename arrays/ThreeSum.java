package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ThreeSum {
    // 15
    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};

        System.out.println(threeSum(arr));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>(); // use only List (not ArrayList)

        for(int k=0; k<nums.length-2; k++){
            if(k > 0 && (nums[k] == nums[k-1])){
                continue;
            }
            int i = k + 1;
            int j = nums.length - 1;
            while (i < j){

                if(nums[i] + nums[j] + nums[k] == 0){
                    list.add(Arrays.asList(nums[i], nums[j], nums[k])); // otherwise it won't work
                    i++;
                    j--;
                    while(i < j && nums[i] == nums[i-1]){
                        i++;
                    }
                    while(i < j && nums[j] == nums[j+1]){
                        j--;
                    }
                }
                else if(nums[i] + nums[j] + nums[k] > 0){
                    j--;
                } else {
                    i++;
                }
            }
        }
        return list;
    }
}
