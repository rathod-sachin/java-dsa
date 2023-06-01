package recursion;

import java.util.Arrays;

public class ReverseString {
    //344
    public static void main(String[] args) {
        char[] arr = {'s', 'a', 'c', 'h', 'i', 'n'};
        reverseString(arr);
        System.out.println(Arrays.toString(arr));
    }

    static public void reverseString(char[] s) {
        reverse(s, 0, s.length-1);
    }

    static public void reverse(char[] s, int i, int j){

        if(i>j){
            return;
        }
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;

        reverse(s, i+1, j-1);
    }
}
