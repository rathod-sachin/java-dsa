package basicQuestions;

public class FibonacciSeries {
    public static void main(String[] args) {
        fibonacci(10);
    }
    public static void fibonacci(int n){
        int i = 0;
        int j = 1;
        int sum;
        System.out.print(i + " " + j + " ");

        for (int k=2; k<n; k++){
            sum = i + j;
            System.out.print(sum + " ");
            i = j;
            j = sum;
        }
    }
}
