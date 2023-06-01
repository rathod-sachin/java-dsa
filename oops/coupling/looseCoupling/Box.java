package oops.coupling.looseCoupling;

public class Box {
   private int volume;

    Box(int length, int height, int breadth){
       this.volume = length * breadth * height;
   }
   public int getVolume(){
        return volume;
   }
}
