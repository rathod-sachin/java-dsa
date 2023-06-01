package oops.Oops3.inheritance;

public class BoxPrice extends BoxWeight{
    double price;

    BoxPrice(double l, double w, double h, double ss, double price){
        super(l,w,h,ss);
        this.price = price;
    }
}
