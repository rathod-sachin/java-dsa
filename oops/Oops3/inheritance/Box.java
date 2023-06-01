package oops.Oops3.inheritance;

public class Box {

    double l;
    double w;
    double h;

    Box() {
        this.l = 1;
        this.w = 2;
        this.h = 3;
    }

    Box(double side) {
        this.l = side;
        this.w = side;
        this.h = side;
    }

    Box(double l, double w, double h){
        this.l = l;
        this.w = w;
        this.h = h;
    }

    Box(Box old){
        this.l = old.h;
        this.w = old.w;
        this.h = old.h;
    }
    static void greeting(){
        System.out.println("hey there in box class");
    }

    public static void main(String[] args) {
       Box box1 = new Box();
        System.out.println(box1.l);
        System.out.println(box1.l);
    }

}


