public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(4.0, 6.0);
        shapes[0] = circle;
        shapes[1] = rectangle;
        
        System.out.println("Before resize: ");
        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                System.out.println("Area of " + shape + " is " + ((Circle) shape).getArea());
            } else if (shape instanceof Rectangle) {
                System.out.println("Area of " + shape + " is " + ((Rectangle) shape).getArea());
            }
        }

        var percent = Math.random() * 200;
        System.out.println("After resize " + percent + "%: ");
        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                ((Circle) shape).resize(percent);
                System.out.println("Area of " + shape + " is " + ((Circle) shape).getArea());
            } else if (shape instanceof Rectangle) {
                ((Rectangle) shape).resize(percent);
                System.out.println("Area of " + shape + " is " + ((Rectangle) shape).getArea());
            }
        }
    }
}
