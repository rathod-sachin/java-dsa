package arrBi2D;
import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] nums = {4,5,8,9,9,9,9,9,9,10,11,13,15};
        int target = 9;

        System.out.println(Arrays.toString(searchRange(nums,target)));

    }
    static int[] searchRange(int[] num, int target){
        int[] ans = new int[2];
        ans[0] = findFirstIndex(num, target);
        ans[1] = findLastIndex(num, target);

        return ans;
    }

    static int findFirstIndex(int[] num, int target){
        int ans = -1;
        int s = 0;
        int end = num.length-1;


        while(s<=end){
            int mid = s + (end-s) / 2;

            if(num[mid]<target){
                s=mid+1;
            }else if(num[mid]>target){
                end=mid-1;
            } else{
                ans = mid;
                end=mid-1;
            }
        }
        return ans;
    }
    static int findLastIndex(int[] num, int target){
        int ans = -1;
        int s = 0;
        int end = num.length-1;

        while(s<=end){
            int mid = s + (end-s) / 2;
            if(num[mid]<target){
                s=mid+1;
            }else if(num[mid]>target){
                end=mid-1;
            }else{
                ans = mid;
                s=mid+1;
            }
        }
        return ans;
    }
}