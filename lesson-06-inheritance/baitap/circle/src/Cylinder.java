public class Cylinder extends Circle{
    private double height = 2.0;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color) {
        super(radius, color);
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    @Override
    public double getArea() {
        return super.getPerimeter() * height + (super.getArea() * 2);
    }
    public double getVolume() {
        return super.getArea() * height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                "}, is a subclass of " + super.toString();
    }
}
