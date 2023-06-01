package arrBi2D;
public class FindKthPositive {
    public static void main(String[] args) {
        int[] arr = {2,3,5,8,9};
        int k = 3;
        System.out .println(findKthPositive(arr,k));
    }
    static int findKthPositive(int[] arr, int k) {
        int start = 0, end = arr.length;
        while(start < end){
            int mid = start + ((end - start)/2);
            if((k <= arr[mid] - (mid  + 1)) ){
                end = mid;
            }else{
                start = mid + 1;
            }
        }
        return start + k ;
    }
}
