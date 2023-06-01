package arrBi2D;

public class PeakElement {
    public static void main(String[] args) {
        int[] arr = {5,6,7,1,2,3,4};
        System.out.println(peakElement(arr));
    }
    static int peakElement(int[] arr){

        int s = 0;
        int e = arr.length-1;

        while(s<e){
            int mid = s + (e-s) / 2;

            if(arr[mid]>arr[mid+1]) {
                return mid; // peak element index
            } else if (arr[mid] < arr[mid - 1]) {
                return mid-1;
            } else if (arr[mid] < arr[s]) {
                e = mid -1;
            } else {
                s = mid;
            }
        }
        return -1;
    }
}

