package hash;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UnionOf2Arrays {
    public static void main(String[] args) {
        int[] arr1 = {5,10,15,5};
        int[] arr2 = {10,15,4,5};

        System.out.println(union(arr1, arr2));
    }
    public static Set<Integer> union(int[] arr1, int[] arr2){
        Set<Integer> set = new HashSet<>();

            for(int element : arr1) set.add(element);
            for (int element : arr2) set.add(element);

        return set;
    }
}
