package strings;

public class DivisibleBy7 {
    public static void main(String[] args) {
        String s = "34567544567876543456732456";

        System.out.println(isDivisible(s));
    }
    public static int isDivisible(String s){
        int n = 0;

        for(int i=0; i<s.length(); i++){
            n = n * 10 + (s.charAt(i) - '0');
            n = n % 7;
        }
        if(n % 7 == 0){
            return 1;
        }
        return 0;
    }
}
