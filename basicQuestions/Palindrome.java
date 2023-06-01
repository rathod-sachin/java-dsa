package basicQuestions;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("123454321"));
    }
    public static boolean isPalindrome(String s){
        int i = 0;
        int j = s.length() - 1;

        while (i < j){
            if (s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}