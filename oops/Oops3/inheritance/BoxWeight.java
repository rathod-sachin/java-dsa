package oops.Oops3.inheritance;

public class BoxWeight extends Box {
        double ss;

        BoxWeight(double l, double w, double h, double ss){
            super(l,w,h);
            this.ss = ss;
        }
//        BoxWeight(){
//                this.ss = -1;
//        }
         static void greeting(){
                System.out.println("hey there in boxweight class");
        }

        public static void main(String[] args) {
                BoxWeight box1 = new BoxWeight(2,2,5,7);
                System.out.println(box1.w);
        }
}
