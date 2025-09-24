class Box {
    private double length, width, height;
    public Box() {
        this(1);
    }
    public Box(double side) {
        this(side, side, side);
    }
    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
    public double volume() {
        return length * width * height;
    }
}
public class BoxDemo {
    public static void main(String[] args) {
        Box b1 = new Box();
        Box b2 = new Box(5);
        Box b3 = new Box(2, 3, 4);
        System.out.println("Volume b1 = " + b1.volume());
        System.out.println("Volume b2 = " + b2.volume());
        System.out.println("Volume b3 = " + b3.volume());
    }
}
