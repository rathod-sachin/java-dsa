package codyLab;

public class Three {
    public static void main(String[] args) {
            String move = "RRLUUD";
            finalPosition(move);
        }
    static void finalPosition(String move) {

        int l = move.length();
        int countUp = 0, countDown = 0;
        int countLeft = 0, countRight = 0;


        for (int i = 0; i < l; i++) {
            if (move.charAt(i) == 'U')
                countUp++;

            else if (move.charAt(i) == 'D')
                countDown++;

            else if (move.charAt(i) == 'L')
                countLeft++;

            else if (move.charAt(i) == 'R')
                countRight++;
        }
        System.out.println("up" + countUp + " " + "down" + countDown + " " + "left" + countLeft + " " + "right" + countRight);
    }
}
