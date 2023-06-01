package linkedList;

public class HappyNumber {
    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }
    public static boolean isHappy(int n){
        int slow = n;
        int fast = n;

        do{
            slow = squareOf(slow);
            fast = squareOf(squareOf(fast));
        } while (slow != fast);

        if(slow == 1){
            return true;
        }
        return false;
    }
    public static int squareOf(int number){
        int ans = 0;

        while (number > 0){
            int rem = number % 10;
            ans += rem * rem;
            number /= 10;
        }
        return ans;
    }
}
