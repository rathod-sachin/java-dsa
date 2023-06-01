package maths;

public class OddEven {
    public static void main(String[] args) {
        oddEven(123);
    }
    public static void oddEven(int n){

        if( (n & 1) == 1){
            System.out.println("it's a odd number");
        } else {
            System.out.println("it's a even number");
        }
    }
}
