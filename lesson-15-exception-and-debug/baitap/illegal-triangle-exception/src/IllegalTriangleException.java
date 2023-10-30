import java.util.Scanner;

public class IllegalTriangleException extends Throwable {
    public final static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        do {
            try {
                System.out.println("Nhập cạnh a: ");
                int a = SCANNER.nextInt();
                System.out.println("Nhập cạnh b: ");
                int b = SCANNER.nextInt();
                System.out.println("Nhập cạnh c: ");
                int c = SCANNER.nextInt();
                checkTriangle(a, b, c);
                break;
            } catch (IllegalTriangleException illegalTriangleException) {
                System.err.println("Not a legal triangle");
            }
        } while (true);

    }

    public static void checkTriangle(int a, int b, int c) throws IllegalTriangleException {
        IllegalTriangleException illegalTriangleException = new IllegalTriangleException();
        if ((a <= 0 || b <= 0 || c <= 0) || (a + b) < c || (a + c) < b || (b + c) < a) {
            throw illegalTriangleException;
        } else {
            System.out.println("Legal Triangle");
        }
    }
}
