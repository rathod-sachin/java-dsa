package strings;

public class EqualNoOfZeroOne {
    // https://www.geeksforgeeks.org/split-the-binary-string-into-substrings-with-equal-number-of-0s-and-1s/

    public static void main(String[] args) {
        String s = "00110011";

        System.out.println(equal(s));
    }
    public static int equal(String s){
        int count0 = 0;
        int count1 = 0;
        int finalCount = 0;

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '0'){
                count0++;
            } else {
                count1++;
            }
            if(count0 == count1){
                finalCount++;
                count0 = 0;
                count1 = 0;
            }
        }
        if(count0 != count1){
            return -1;
        }
        return finalCount;
    }
}
