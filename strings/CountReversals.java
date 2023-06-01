package strings;

public class CountReversals {
    // https://practice.geeksforgeeks.org/problems/count-the-reversals0401/1
    public static void main(String[] args) {
        // wrong
    }
    public static int reversal(String s){
        if(s.length() % 2 != 0 ){
            return -1;
        }
        int count1 = 0;
        int count2 = 0;

        for(int i=0; i<s.length(); i++){

            if(s.charAt(i) == '{'){
                count1++;
            } else {
                count2++;
            }
        }
        if(count1 == count2){

        }
        return 6;
    }
}
