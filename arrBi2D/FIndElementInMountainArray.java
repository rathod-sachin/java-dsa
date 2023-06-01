package arrBi2D;
public class FIndElementInMountainArray {
    public static void main(String[] args) {
        int[] arr = {2,4,6,5,3,1,0};
        int target = 5;

        System.out.println(search(arr,target));
    }

    static int search(int[] arr, int target){
        int peak = peakelement(arr);
        int firsttry = orderAgnosticBS(arr, target, 0, peak);
        if(firsttry != -1){
            return firsttry;
        } else {
            return orderAgnosticBS(arr,target, peak+1, arr.length-1);
        }
    }

    static int peakelement(int[] arr){

        int s = 0;
        int e = arr.length-1;

        while(s<e){
            int mid = s + (e-s) / 2;

            if(arr[mid]<arr[mid+1]){
                s = mid + 1;
            }else{
                e = mid;
            }
        }
        return s;
    }

    static int orderAgnosticBS(int[] arr, int target, int start, int end) {

        boolean isAsc = arr[start] < arr[end];

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
