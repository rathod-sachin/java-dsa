package recursion;
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {4,7,9,12,18};
        int tar = 120;

        System.out.println(bs(arr, tar, 0, arr.length-1));
    }

    static int bs(int[] arr, int tar, int s, int e){

        int mid = s + (e-s) / 2;

        if(s>e){
            return -1;
        }
        if(arr[mid] == tar){
            return mid;
        }
        if(tar > arr[mid]){
            return bs(arr, tar, mid+1, e);
        }
        return bs(arr, tar, s, mid-1);
    }
}