package searchingAndSorting;

public class SticklerThief {
    // https://practice.geeksforgeeks.org/problems/stickler-theif-1587115621/1
    public static void main(String[] args) {
        int[] arr = {1,2,3};

        System.out.println(loot(arr, arr.length-1));
    }

    public static int loot(int[] arr, int n) {

        if (n < 0) {
            return 0;
        }
        if (n == 0) {
            return arr[0];
        }

        int pick = arr[n] + loot(arr, n - 2);
        int notPick = loot(arr, n - 1);

        return Math.max(pick, notPick);
    }
}
