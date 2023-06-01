import java.util.Arrays;

public class Smaller {
    public static void main(String[] args) {
        int[] num = {7,7,7,7};
        int[] ash = free(num);

        System.out.println(Arrays.toString(ash));
    }

    static int[] free(int[] nums){
        int[] ans = new int[nums.length];

        for(int i=0; i<nums.length; i++){
            int count = 0;
            for(int j=1; j<nums.length; j++){
                if(nums[i]>nums[j]){
                    count ++;
                }
            }
            ans[i] = count;
        }
        return ans;
    }
}
