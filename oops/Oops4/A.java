package oops.Oops4;

public class A {
   private int num = 12;
    String name;
    int[] arr;

    public int getNum() {
        return num;
    }
    public void setNum(int num){
        this.num = num;
    }

    A(int num, String name){
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }
    A(){
        this.num = 16;
        this.name = "sachin";
        this.arr = new int[num];
    }
}
