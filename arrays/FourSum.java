package arrays;

import java.util.*;

public class FourSum {
    public static void main(String[] args) {
        int[] arr = {1,0,-1,0,-2,2,0};

        System.out.println(fourSum(arr,0));
    }
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> set = new ArrayList<>();
        Arrays.sort(nums);
        for(int k=0; k<nums.length-3; k++){
            if(k > 0 && nums[k] == nums[k-1]){
                continue;
            }
            for(int l=k+1; l<nums.length-2; l++){
                if(l > 0 && nums[l] == nums[l-1]){
                    continue;
                }
                int i = l + 1;
                int j = nums.length - 1;
                while (i < j){
                    int sum = nums[i] + nums[j] + nums[k] + nums[l];

                    if (sum == target){
                        set.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
                        while(i<j && nums[i] == nums[i+1]) i++;
                        while(i<j && nums[j] == nums[j-1]) j--;
                        i++;
                        j--;
                    } else if (sum > target) {
                        j--;
                    } else {
                        i++;
                    }
                }
            }
        }
        return set;
    }
}

//    Set<List<Integer>> set = new HashSet<>();
//        Arrays.sort(nums);
//
//                for(int i=0; i<nums.length-3; i++){
//        for(int j=i+1; j<nums.length-2; j++){
//        int left = j + 1;
//        int right = nums.length - 1;
//
//        while (left < right){
//        int sum = nums[i] + nums[j] + nums[left] + nums[right];
//
//        if(sum == target){
//        set.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
//        left++;
//        right--;
//        }
//        else if(sum > target){
//        right--;
//        } else {
//        left++;
//        }
//        }
//        }
//        }
//        return new ArrayList<>(set);
//        }
//        }