package oops.Oops5.AbstractDemo.Interface;

public class Main {
    public static void main(String[] args) {
        Engine car = new Car();
        Car car2 = new Car();
        System.out.println(car.a);
        System.out.println(car2.a);
        car.acc();
        car.start();
        car.stop();
    }
}
