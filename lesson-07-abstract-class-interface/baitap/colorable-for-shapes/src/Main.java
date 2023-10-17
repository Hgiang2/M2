public class Main {
    public static void main(String[] args) {
        System.out.println("Before color:");
        Rectangle square = new Rectangle(5.0, 5.0, "red", false);
        System.out.println(square);
        System.out.println("After color: ");
        square.howToColor();
        System.out.println(square);
    }
}