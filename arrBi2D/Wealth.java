public class Wealth {
    public static void main(String[] args){
        int[][] accounts = {
                {1,2,3},
                {4,5,6},
                {7,8,9,10}
        };
        System.out.println(wealth(accounts));

    }

    static int wealth(int [][] accounts){
        int ans = 0;
        for(int person=0; person<accounts.length; person++){
            int sum = 0;
            for(int account=0; account<accounts[person].length; account++){
                sum = sum + accounts[person][account];
            }
            if(sum>ans){
                ans = sum;
            }
        }
        return ans;
    }
}
