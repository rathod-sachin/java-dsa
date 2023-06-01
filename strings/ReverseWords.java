package strings;

public class ReverseWords {
    public static void main(String[] args) {
        String s = "   i am  sachin   rathod   ";

        System.out.println(reverse(s));
    }
    public static String reverse(String s){
        int i = s.length() - 1;
        StringBuilder sb = new StringBuilder();
        while (i >= 0){
            while (i >= 0 && s.charAt(i) == ' '){
                i--;
            }
            if(i < 0){
                break;
            }
            int j = i;

            while (i >= 0 && s.charAt(i) != ' '){
                i--;
            }
            if(sb.isEmpty()){
                sb.append(s, i+1, j+1);
            } else {
                sb.append(" ").append(s, i + 1, j + 1);
            }
        }
        return sb.toString();
    }
}
//    StringBuilder sb = new StringBuilder();
//    int i = S.length() - 1;
//
//        while(i >= 0){
//                int j = i;
//
//                while(i >= 0 && S.charAt(i) != '.'){
//                i--;
//                }
//                if(sb.isEmpty()){
//                sb.append(S, i+1, j+1);
//                } else {
//                sb.append(" ").append(S, i + 1, j + 1);
//                }
//                }
//                return sb.toString();
//                }
//                }