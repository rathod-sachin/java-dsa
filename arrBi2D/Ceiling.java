package arrBi2D;
public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 8, 10, 12, 13};
        int tar = 10;

        System.out.println(ceiling(arr, tar));
    }

    static int ceiling(int[] arr, int tar) {

        int s = arr[0];
        int e = arr.length - 1;

        while (s <= e) {
            int mid = s + (e-s) / 2;

            if (tar < arr[mid]) {
                e = mid - 1;
            } else if (tar > arr[mid]) {
                s = mid + 1;
            } else {
                return mid;
            }
        }
        return s;
    }
}
