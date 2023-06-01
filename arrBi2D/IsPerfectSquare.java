public class IsPerfectSquare {
    public static void main(String[] args) {
        int x = 100;
        System.out.println(isPerfectSquare(x));

    }
    static boolean isPerfectSquare(int num){
        int s = 0;
        int e = num;

        while (s<=e){
            int mid = s + (e-s)/2;

            if(mid*mid==num){
                return true;
            } else if (mid*mid > num) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return false;
    }
}
