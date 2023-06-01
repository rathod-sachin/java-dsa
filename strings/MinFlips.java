package strings;

public class MinFlips {
    // https://practice.geeksforgeeks.org/problems/min-number-of-flips3210/1
    public static void main(String[] args) {
        String s = "001";

        System.out.println(flips(s));
    }
    public static int flips(String s){

        int ans1 = 0;
        for(int i=0; i<s.length(); ++i){
            if(i % 2 == 1 && s.charAt(i) == '0' || i % 2 == 0 && s.charAt(i) == '1'){
                ans1++;
            }
        }
        int ans2 = 0;
        for(int i=0; i<s.length(); ++i){
            if(i % 2 == 1 && s.charAt(i) == '1' || i % 2 == 0 && s.charAt(i) == '0'){
                ans2++;
            }
        }
        return Math.min(ans1, ans2);
    }
}
