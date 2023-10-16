public class Main {
    public static void main(String[] args) {
        MoveablePoint moveablePoint = new MoveablePoint(0, 0, 1, 1);
        moveablePoint.move();
        moveablePoint.move();
        System.out.println(moveablePoint.toString());
    }
}