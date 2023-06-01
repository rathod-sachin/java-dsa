package recursion;

public class Print1ToN {
    // gfg
    public static void main(String[] args) {
        printNum(15);
    }
    static public void printNum(int n){
        if(n<1){
            return;
        }
        printNum(n-1);
        System.out.print(n + " ");

    }
}
