package arrays;

public class BuyAndSell {
    // 121
    public static void main(String[] args) {
        int[] arr = {7,6,1,4,3,1,9};

        System.out.println(stock(arr));
    }
    public static int stock(int[] arr){
        int minBuy = arr[0];
        int maxProfit = 0;

        for(int i=1; i<arr.length; i++){
            minBuy = Math.min(arr[i], minBuy);
            maxProfit = Math.max(maxProfit, arr[i] - minBuy);
        }
        return maxProfit;
    }
}
