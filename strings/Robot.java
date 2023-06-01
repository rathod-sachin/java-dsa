package strings;
public class Robot {
    public static void main(String[] args) {
        String s = "UD";

        System.out.println(judgeCircle(s));
    }

    static boolean judgeCircle(String moves) {
        int up = 0;
        int down = 0;
        int left = 0;
        int right = 0;

        for (int i = 0; i < moves.length(); i++) {
            switch (moves.charAt(i)) {
                case 'U': up++;
                    break;
                case 'D': down++;
                    break;
                case 'R': right++;
                    break;
                default: if (moves.charAt(i) == 'L') {
                        left++;
                    }
                    break;
            }
        }
            return left == right && up == down;
        }
}
