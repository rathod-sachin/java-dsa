package oops.Oops2;

public class AHuman {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;

    public AHuman(int age, String name, int salary, boolean married){
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        population += 1;
    }
}
