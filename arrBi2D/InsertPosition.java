package arrBi2D;
public class InsertPosition {
    public static void main(String[] args) {
        int nums [] = {1,3,5,6};
        int target = 5;

        System.out.println(insert(nums, target));
    }
    static int insert(int[] nums, int target){
        int s = 0;
        int e = nums.length;

        while (s<=e){
            int mid = s + (e-s) / 2;
            if((target == nums[mid])){
                return mid;
            } else if (target< nums[mid]) {
                e = mid;
            } else{
                s = mid + 1;
            }
        }
        return s;
    }
}
