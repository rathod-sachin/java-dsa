package arrays;

public class MostWater {
    // 11
    public static void main(String[] args) {
        int[] arr = {6,3,5,9,8,1};

        System.out.println(maxArea(arr));
    }
    public static int maxArea(int [] height){
        int ans = Integer.MIN_VALUE;
        int value;
        int i = 0;
        int j = height.length - 1;

        while(i < j){
            value = (j-i) * Math.min(height[i], height[j]);
            ans = Math.max(value, ans);

            if(height[i] > height[j]){
                j--;
            } else {
                i++;
            }
        }
        return ans;
    }
}
