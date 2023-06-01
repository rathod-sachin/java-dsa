package arrBi2D;

public class Union {
    public static void main(String[] args) {
        int[] arr1 = {1,5,15,10};
        int k = 3;

        System.out.println(union(arr1, k));
    }
    public static int union(int[] arr1, int k){
        int[] ans = new int[arr1.length];
        for(int i=0; i<arr1.length; i++){

            if(arr1[i] >= k){
                ans[i] = arr1[i] - k;
            }
            else {
                ans[i] = arr1[i] + k;
            }
        }
        int n = ans[ans.length-1] - ans[0];

        return n;
    }
}
