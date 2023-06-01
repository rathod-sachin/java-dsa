package oops.Oops5.AbstractDemo;

public class Main{
    int n;
    String name;
    int m;

    Main(int n, String name){
       this.n = n;
        System.out.println("hey there");
       this.name = name;
    }
    Main(){
      this.m = 12;
    }

    public static void main(String[] args) {
        Main sum = new Main(12,"sachin");

        System.out.println(sum.name);
        System.out.println(sum.n);

        sum.n = 45;
        System.out.println(sum.n);

        Main sum2 = new Main();
        System.out.println(sum2.m);
    }
}

