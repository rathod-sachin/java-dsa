package oops.coupling.tightCoupling;

public class Volume {
    public static void main(String[] args) {
        Box box = new Box(4,5,6);

        System.out.println(box.volume);
    }
}
