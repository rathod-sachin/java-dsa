package arrBi2D;
public class ArrangingCoins {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(count(n));
    }
    static int count(int n){
        long s = 1;
        long e = n;
        long mid;
        long ans = 0;


        while(s<=e){
            mid=s+(e-s)/2;

            long no_of_coins=mid*(mid+1)/2;

            if(no_of_coins<=n){
                ans=mid;
                s=mid+1;
            }else{
                e=mid-1;
            }
        }
        return (int)ans;
    }
}