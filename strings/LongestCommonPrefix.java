package strings;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] s = {"flower","flow","flight"};

        System.out.println(longestCommonPrefix(s));
    }
    public static String longestCommonPrefix(String[] arr){
        if(arr == null || arr.length == 0){
            return "";
        }
        Arrays.sort(arr);
        String first = arr[0];
        String second = arr[arr.length-1];
        int c = 0;

        while (c < first.length() && first.charAt(c) == second.charAt(c)){
            c++;
        }
        if (c == 0){
            return "";
        }
        return first.substring(0, c);
    }
}
//     Arrays.sort(arr);
//             String s = arr[0];
//             String e = arr[arr.length-1];
//             StringBuilder ans = new StringBuilder();
//             int i = 0;
//             while (i < s.length()){
//        if (s.charAt(i) == e.charAt(i)) {
//        ans.append(s.charAt(i));
//        } else {
//        break;
//        }
//        i++;
//        }
//        if(ans.isEmpty()){
//        return "";
//        }
//        return ans.toString();
//        }
//        }
