package strings;

public class ReverseWordsInAString {
    // 557
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";

        System.out.println(reverse(s));
    }
    public static String reverseWords(String s){
        String[] arr = s.split(" ");
        StringBuilder ans = new StringBuilder();

        for (String value : arr) {
            ans.append(" ").append(reverse(value));
        }
        ans.delete(0,1);
        return ans.toString();
    }
    public static String reverse(String st) {
        char[] arr = st.toCharArray();
        int s = 0;
        int e = arr.length - 1;

        while (s <= e){
            char temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
        return String.valueOf(arr);
    }
}
