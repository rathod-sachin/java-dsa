package strings;

public class LargestSubStringBetween2EqualChars {
    public static void main(String[] args) {
        System.out.println(firstUniqueChar("leeztlcode"));
    }
    public static int firstUniqueChar(String s) {

        for(int i=0; i<s.length(); i++){
//            int index = s.lastIndexOf(s.charAt(i));
            if(s.lastIndexOf(s.charAt(i)) == s.indexOf(s.charAt(i))){
                return s.indexOf(i);
            }
        }
        return -1;
    }
}
