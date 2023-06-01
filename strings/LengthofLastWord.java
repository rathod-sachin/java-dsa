package strings;

public class LengthofLastWord {
    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(s));
    }

    static int lengthOfLastWord(String s) {
        String a = s.trim();
        int count = 0;

        for (int i = a.length() - 1; i >= 0; i--) {
            if (a.charAt(i) == ' ') {
                break;
            }
            else {
                count++;
            }
        }
        return count;
    }
}
