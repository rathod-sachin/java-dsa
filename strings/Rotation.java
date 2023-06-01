package strings;

public class Rotation {
    public static void main(String[] args) {

        String s1 = "abacd";
        String s2 = "cdaba";

        System.out.println(rotation(s1,s2));
    }
    public static boolean rotation(String s1, String s2){
        String temp = s1.concat(s1);

        if(temp.contains(s2)){
            return true;
        }
        return false;
    }
}
