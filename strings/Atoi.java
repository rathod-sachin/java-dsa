package strings;

public class Atoi {
    // https://practice.geeksforgeeks.org/problems/implement-atoi/1
    public static void main(String[] args) {
        String s = "-12a3";

        System.out.println(atoi(s));
    }
    public static int atoi(String str){
        int ans = 0;
        boolean flag = false;

        for(int i=0; i<str.length(); i++){
            if (str.charAt(i) == '-' && i == 0){
                flag = true;
            } else if (str.charAt(i) - '0' >= 0 && str.charAt(i) - '0' <= 9) {
                ans = (ans * 10) + str.charAt(i) - '0';
            } else {
                return -1;
            }
        }
        if (flag){
            return ans * (-1);
        }
        return ans;
    }
}