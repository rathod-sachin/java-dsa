 class Area {
   private static int length;
    private static int breadth;

    public static void setArea(int length, int breadth){
        Area.length = length;
        Area.breadth = breadth;
    }
    public int getArea() {
        return length * breadth;
    }
}

class Mainn {
    public static void main(String[] args) {
        Area area = new Area();

        Area.setArea(23,65);
        System.out.println(area.getArea());

    }
}
