package oops.Oops6.exceptionHandling;

class Main {
    public static void main(String[] args) {
        String a = "hi";
        String b = "hello";
        String c = "hi";
        String d = b;
        String e = new String("hello");


        System.out.println(b==e);
        System.out.println(b.equals(e));
    }
}
