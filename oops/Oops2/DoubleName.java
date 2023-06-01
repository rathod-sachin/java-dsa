package oops.Oops2;


public class DoubleName {
    static class Test {
        String name;

        Test(String name) {
            this.name = name;

        }
    }

    static public void main(String[] args) {
        Test obj = new Test("Sachin");
       Test obj2 = new Test("abc");

        System.out.println(obj.name);
        System.out.println(obj2.name);
}
}
