package arrBi2D;

public class SingleElement {
    //540
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3};

        System.out.println(singleElement(arr));

    }
    static int singleElement(int[] nums){
        int s = 0;
        int e = nums.length-1;

        while(s<e){
            int mid = s+(e-s)/2;

            if(mid % 2 == 0){
                if(nums[mid]==nums[mid+1]){
                    s = mid + 1;
                } else {
                    e = mid;
                }
            } else if(mid % 2 != 0) {
                if(nums[mid] == nums[mid+1]){
                    e = mid;
                } else{
                    s = mid + 1;
                }
            }
        }
        return nums[s];
    }
}

//
//    int s = 0;
//    int e = nums.length-1;
//
//        while(s<e){
//        int mid = s + (e-s) / 2;
//
//        if(nums[mid] != nums[mid+1] && nums[mid] != nums[mid-1]){
//        return nums[mid];
//        }
//        else if(mid % 2 == 0){
//        if(nums[mid] == nums[mid + 1]){
//        s = mid + 1;
//        } else{
//        e = mid;
//        }
//        } else if( mid % 2 != 0){
//        if(nums[mid] == nums[mid+1]){
//        e = mid;
//        } else{
//        s = mid + 1;
//        }
//        }
//        }
//        return nums[s];
//        }
//        }
