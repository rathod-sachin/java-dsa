package recursion;

public class Fibonacci {
    //509
    public static void main(String[] args) {
        System.out.println(fib(7));
    }
   static public int fib(int n) {
        if(n < 2){
            return n;
        }
        return fib(n-1) + fib(n-2);
    }
}
