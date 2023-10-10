import java.awt.*;
import java.util.Scanner;

public class DrawGeometry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Draw the triangle");
        System.out.println("2. Draw the square");
        System.out.println("3. Draw the rectangle");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");

        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Draw the triangle");
                System.out.print("Enter width: ");
                int widthTriangle = scanner.nextInt();
                for (int i = 0; i < widthTriangle; i++) {
                    for (int j = widthTriangle - i; j > 0; j--) {
                        System.out.print("*");
                    }
                    System.out.print("\n");
                }
                break;
            case 2:
                System.out.println("Draw the square");
                System.out.print("Enter width: ");
                int widthSquare = scanner.nextInt();
                for (int i = 0; i < widthSquare; i++) {
                    for (int j = 0; j < widthSquare; j++) {
                        System.out.print("*");
                    }
                    System.out.print("\n");
                }
                break;
            case 3:
                System.out.println("Draw the rectangle");
                System.out.print("Enter width: ");
                int widthRectangle = scanner.nextInt();
                System.out.print("Enter height: ");
                int heightRectangle = scanner.nextInt();
                for (int i = 0; i < widthRectangle; i++) {
                    for (int j = 0; j < heightRectangle; j++) {
                        System.out.print("*");
                    }
                    System.out.print("\n");
                }
                break;
            case 4:
                System.out.println("See you again!");
            default:
                System.out.println("No choices!");
        }
    }
}
