package basicQuestions;

public class Armstrong {
    public static void main(String[] args) {
        System.out.println(isArmstrong(117));
    }
    public static boolean isArmstrong(int n){
        int temp = n;
        int remainder;
        int result = 0;

        while (temp != 0){
            remainder = temp % 10;
            result +=  Math.pow(remainder, 3);
            temp = temp / 10;
        }
        return result == n;
    }
}
