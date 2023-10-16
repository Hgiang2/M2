public class Main {
    public static void main(String[] args) {
        var cylinder1 = new Cylinder(5, "blue", 10);
        System.out.println("Volume of " + cylinder1 + " is " + cylinder1.getVolume());
        var circle1 = new Circle(2, "purple");
        System.out.println("Area of " + circle1 + " is " + circle1.getArea());
    }
}