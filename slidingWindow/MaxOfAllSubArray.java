package slidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class MaxOfAllSubArray {
    public static void main(String[] args) {
        int[] arr = {1,3,-1,-3,5,3,6,7};

        System.out.println(maxOfAll(arr,3));
    }

    public static ArrayList<Integer> maxOfAll(int[] nums, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        Deque<Integer> deque = new LinkedList<>();
        int i = 0;
        int j = 0;
        int max = Integer.MIN_VALUE;

        while (j < nums.length) {
            if (nums[j] > max) {
                max = nums[j];
            }
            while (deque.size() > 0 && deque.getLast() < nums[j]) {
                deque.removeLast();
            }
            deque.add(nums[j]);

            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {
                list.add(deque.getFirst());
                if (nums[i] == deque.getFirst()) {
                    deque.removeFirst();
                }
//                max = deque.peek();
                i++;
                j++;
            }
        }
//        int[] ans = new int[list.size()];
//        int l = 0;
//        for (int z = 0; z<list.size(); z++){ // for leetCode
//            ans[l++] = list.get(z);
//        }
        return list;
    }
}