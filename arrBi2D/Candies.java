package arrBi2D;
public class Candies {
    public static void main(String[] args) {

        int[] candies = {1,4,6,7};
        int extracandies = 1;

        for(boolean x : KidsWithCandies(candies, extracandies))
            System.out.print(x + " ");
    }
    static boolean[] KidsWithCandies(int[] candies, int extracandies){
        int n = candies.length;
        int maxcand = 0;

        for(int i=0; i<n; i++){
            if(candies[i]>maxcand){
                maxcand = candies[i];
            }
        }
        boolean[] ans = new boolean[n];

        for(int i=0; i<n; i++){
            ans[i] = (candies[i] + extracandies >= maxcand);
        }
        return ans;
    }
}
