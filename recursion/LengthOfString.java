package recursion;

public class LengthOfString {
    public static void main(String[] args) {
        //gfg
        String s = "sachin";

        System.out.println(length(s));
    }
    static int length(String s){
        if(s.equals(""))
            return 0;

       else return length(s.substring(1)) + 1;
    }
}
