public class MountainArray {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,9,10,12,16,7,5,4,4,4};
        System.out.println(larele(arr));
    }
    static int larele(int[] arr){

        int s = 0;
        int e = arr.length-1;

        while (s<e){
            int mid = s + (e-s)/2;

            if(arr[mid]>arr[mid+1]) {
                e = mid;
            }else{
                s = mid +1;
            }
        }
        return s;
    }
}
