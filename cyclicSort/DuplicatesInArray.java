package cyclicSort;
public class DuplicatesInArray {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1,5,8,7,6,2};

        System.out.println(sort(arr));
    }

    static int sort(int[] nums){
        int i=0;

        while (i < nums.length) {
            if(nums[i] != i+1) {
                int corr = nums[i] - 1;
                if (nums[i] != nums[corr]) {
                    swap(nums, i, corr);
                } else {
                    return nums[i];
                }
            } else {
                    i++;
                }
        }
            return -1;
    }
    static void swap(int[]arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
