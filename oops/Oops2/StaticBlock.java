package oops.Oops2;
public class StaticBlock {
    static int a = 4;
    static int b;

    static {
        System.out.println("i am good");
        b = a * 5;
    }

    public static void main(String[] args) {

    }
}
