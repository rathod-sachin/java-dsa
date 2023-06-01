package strings;

import java.util.Arrays;

public class ValidShuffle {
    // https://www.programiz.com/java-programming/examples/check-valid-shuffle-of-strings

    public static void main(String[] args) {
        String s1 = "xy";
        String s2 = "12";
        String s3 = "xy12";

        System.out.println(valid(s1,s2,s3));
    }
    public static boolean valid(String s1, String s2, String s3){
        if(s1.length() + s2.length() != s3.length()){
            return false;
        }

        s1 = sort(s1);
        s2 =  sort(s2);
        s3 = sort(s3);
        int i=0;
        int j=0;
        int k=0;

        while ( k < s3.length()){

            if(i < s1.length() && s1.charAt(i) == s3.charAt(k)){
                i++;
            } else if (j < s2.length() && s2.charAt(j) == s3.charAt(k)) {
                j++;
            } else {
                return false;
            }
            k++;
        }
        return true;
    }

    public static String sort(String s){
        char[] ch = s.toCharArray();
        Arrays.sort(ch);

        s = String.valueOf(ch);
        return s;
    }
}
