import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] numbers = {2,7,11,15};
        int tar = 26;

        System.out.println(Arrays.toString(twosum(numbers,tar)));

    }
    static int[] twosum(int[] numbers, int tar){
        int s = 0;
        int e = numbers.length-1;
        int[] ans = new int[2];

        while(s<e){
            if(numbers[s]+numbers[e]>tar){
                e--;
            } else if(numbers[s]+numbers[e]<tar){
                s++;
            } else {
                ans[0] = s+1;
                ans[1] = e+1;
                break;
            }
        }
        return ans;
    }
}
