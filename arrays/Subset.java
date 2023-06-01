package arrays;

import java.util.Arrays;

public class Subset {
    // https://practice.geeksforgeeks.org/problems/array-subset-of-another-array2317/1
    // not a perfect code, time compexity is high
    public static void main(String[] args) {
        int[] a1 = {1, 2, 3, 4, 5, 6};
        int[] a2 = {1,2,4};

        System.out.println(isSubset(a1,a2));
    }

    public static String isSubset( int a1[], int a2[]) {
        Arrays.sort(a1);
        Arrays.sort(a2);
        int i = 0;
        int j = 0;

        while (i<a1.length && j < a2.length){

            if(a1[i] == a2[j]){
                i++;
                j++;
            } else if (a1[i] < a2[j]) {
                i++;
            } else {
                return "No";
            }
        }
        return "Yes";
    }
}
