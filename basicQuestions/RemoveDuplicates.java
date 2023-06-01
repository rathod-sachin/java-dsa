package basicQuestions;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {4, 3, 6, 7, 3, 4, 9, 9, 4};
        System.out.println(Arrays.toString(remove(arr)));
    }

    public static int[] remove(int[] arr) {
        HashSet<Integer> set = new HashSet<>();

        for (int n : arr) {
            set.add(n);
        }
        int[] ans = new int[set.size()];
        int i = 0;
//        Iterator<Integer> it = set.iterator();

        for (int n : set) {
            ans[i++] = n;
        }
//      while (it.hasNext()){
//           ans[i++] = it.next();
//        }
        return ans;
    }
}