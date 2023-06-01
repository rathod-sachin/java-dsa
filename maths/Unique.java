package maths;

public class Unique {
    public static void main(String[] args) {
        // every number is repeating twice, print the only which is only one time.
        // here 9 is only once
        int[] arr = {3,5,7,9,5,3,7};
        System.out.println(ans(arr));
    }

    private static int ans(int[] arr) {
        int unique = 0;

        for(int n : arr){
            unique ^= n;
        }

        return unique;
    }
}
