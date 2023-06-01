package oops.coupling.tightCoupling;

public class Box {
    int volume;

    Box(int length, int height, int breadth){
        this.volume = length * breadth * height;
    }
}
