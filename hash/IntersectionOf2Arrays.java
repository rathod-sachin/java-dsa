package hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class IntersectionOf2Arrays {
    public static void main(String[] args) {
        int[] arr1 = {1,2,9,4,12,3,3};
        int[] arr2 = {4,3,5,3,3};

        System.out.println(Arrays.toString(intersection(arr1,arr2)));
    }
    public static int[] intersection(int[] nums1, int[] nums2){
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> ans = new ArrayList<>();
        int count = 0;
        for(int element : nums1){
            set.add(element);
        }
        for(int element : nums2) {
            if (set.contains(element)) {
                ans.add(element);
                set.remove(element);
            } else {
                set.remove(element);
            }
        }
        int[] res = new int[ans.size()];
        int m = 0;
        for(int element : ans){
            res[m++] = element;
        }
        return res;
    }
}
