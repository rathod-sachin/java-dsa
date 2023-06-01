package OOPS_Durga;

public class Abstract extends Vehicle{
    public int tyres() {
        return 4;
    }

    public static void main(String[] args) {
        Abstract a = new Abstract();

        System.out.println(a.tyres());
    }
}
