package arrBi2D;
public class InfiniteArray {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,8,12,16,19,23,27,29,30,37};
        int target = 37;

        System.out.println(ans(num, target));

    }
    static int ans(int[] arr, int target){
        int start = 0;
        int end = 1;

        while(target>arr[end]){
            int temp = end + 1;
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return binearysearch(arr,start,end,target);
    }

    static int binearysearch(int[] arr, int start, int end, int target){

        while(start<=end){
            int mid = start + (end-start)/2;

            if(target<arr[mid]){
                end = mid - 1;
            } else if (target>arr[mid]) {
                start = mid+1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
