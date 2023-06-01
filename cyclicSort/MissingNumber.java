package cyclicSort;
public class MissingNumber {
    // check comment code also (own)
    public static void main(String[] args) {
        int[] arr = {0,4,2,5,1};

        System.out.println(missingNumber(arr));
    }
    static int missingNumber(int[] nums){
        int i = 0;

        while (i < nums.length) {
            int corr = nums[i];
            if (nums[i]<nums.length && nums[i] != nums[corr]) {
                swap(nums, i, corr);
            } else {
                i++;
            }
        }
        for(int index = 0; index < nums.length; index++){
            if(nums[index] != index){
                return index;
            }
        }
        return nums.length;
    }
    static void swap(int[]arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

//    static public int missingNumber(int[] nums) {
//        insertion(nums);
//        if(nums[0] == 0 && nums[nums.length-1] == nums.length-1){
//            return nums.length;
//        }
//        int s = 0;
//        int e = nums.length-1;
//
//        while (s<=e){
//            int mid = s + (e-s) / 2;
//
//            if(nums[mid] == mid){
//                s = mid + 1;
//            } else {
//                e = mid - 1;
//            }
//        }
//
//        return s;
//    }
//
//    static void insertion(int[] nums){
//        for(int i=0; i<nums.length-1; i++){
//            for(int j=i+1; j>0; j--){
//                if(nums[j] < nums[j-1]){
//                    swap(nums, j, j-1);
//                } else{
//                    break;
//                }
//            }
//        }
//    }
//
//    static void swap(int[] arr, int first, int second){
//        int temp = arr[first];
//        arr[first] = arr[second];
//        arr[second] = temp;
//    }
//}
