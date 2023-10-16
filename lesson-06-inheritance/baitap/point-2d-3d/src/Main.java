import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var point2D = new Point2D(2, 3);
        System.out.println(Arrays.toString(point2D.getXY()));
        System.out.println(point2D.toString());
        var point3D = new Point3D(2, 5, 6);
        System.out.println(Arrays.toString(point3D.getXYZ()));
        System.out.println(point3D.toString());
    }
}