package arrBi2D;
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {3,5,6,8,9,10,12,14};

        System.out.println(binarySearch(arr, 5));
    }
    public static int binarySearch(int[] arr, int tar){
        int s = 0;
        int e = arr.length-1;

        while (s<=e){
            int mid = s + (e-s) / 2;

            if(tar == arr[mid]){
                return mid;
            } else if (tar > arr[mid]){
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return -1;
    }
}
