package strings;

import java.util.ArrayList;

public class FizzBuzz {
    // 412
    public static void main(String[] args) {
        System.out.println(print(100));
    }
    public static ArrayList<String> print(int n){
        ArrayList<String> ans = new ArrayList<>();

        for(int i=1; i<=n; i++){
            if(i % 3 == 0 && i % 5 == 0){
                ans.add("FizzBuzz");
            } else if (i % 3 == 0) {
                ans.add("Fizz");
            } else if (i % 5 == 0) {
                ans.add("Buzz");
            } else {
                ans.add(String.valueOf(i));
            }
        }
        return ans;
    }
}
