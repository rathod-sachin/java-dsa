package basicQuestions;

public class FibonacciRecursion {
    public static void main(String[] args) {

        System.out.println(fibonacci(8));

        for (int i = 0; i <= 8; i++) {

            System.out.print(fibonacci(i) + " ");
        }
    }
    public static int fibonacci(int n){
        if(n == 1 || n == 0){
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
