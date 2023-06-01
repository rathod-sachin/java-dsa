package oops.Oops3.Polymorphism;

public class Main {
    public static void main(String[] args) {
      Circle circle = new Circle();
      Square square = new Square();
      Shapes shapes = new Circle();

      shapes.area();
      circle.area();
    }
}
