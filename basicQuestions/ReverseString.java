package basicQuestions;

public class ReverseString {
    public static void main(String[] args) {

        System.out.println(reverse("sachin rathod"));
    }
    public static String reverse(String s){
        StringBuilder ans = new StringBuilder();
        for (int i=s.length()-1; i>=0; i--){
            ans.append(s.charAt(i));
        }
        return ans.toString();
    }
}