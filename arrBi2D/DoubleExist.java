package arrBi2D;
public class DoubleExist {
    public static void main(String[] args) {
        int[] arr = {2,3,5,8,9,10};
        int t = 0;
        int i=0;
        System.out.println(bs(arr, t, i));
    }

    static boolean bs(int[] arr, int t, int i){
        int s = 0, e = arr.length-1;

        while(s<=e){
            int m=s+(e-s)/2;
            if(t==2*arr[m] && m!=i){
                return true;
            }
            else if(t>2*arr[m]){
                s=m+1;
            }
            else{
                e=m-1;
            }
        }
        return false;
    }
}