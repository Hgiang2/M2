import java.util.Scanner;

public class Geometry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle");
        System.out.println("3. Print isosceles triangle");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");

        int choice = scanner.nextInt();
        String result = "";
        String star = "*";
        switch (choice) {
            case 1:
                System.out.println("Print the rectangle");
                System.out.print("Enter width: ");
                int widthRectangle = scanner.nextInt();
                System.out.print("Enter height: ");
                int heightRectangle = scanner.nextInt();
                for (int i = 0; i < heightRectangle; i++) {
                    for (int j = 0; j < widthRectangle; j++) {
                        result += star;
                    }
                    result += "\n";
                }
                System.out.println(result);
                break;
            case 2:
                System.out.println("Print the square triangle");
                System.out.print("Enter width: ");
                int widthTriangle = scanner.nextInt();
                System.out.println("Choose the square corner: ");
                System.out.println("1. Top Left");
                System.out.println("2. Top Right");
                System.out.println("3. Bottom Left");
                System.out.println("4. Bottom Right");
                int corner = scanner.nextInt();
                switch (corner) {
                    case 1:
                        for (int i = 0; i < widthTriangle; i++) {
                            for (int j = widthTriangle - i; j > 0; j--) {
                                result += star;
                            }
                            result += "/n";
                        }
                        System.out.println(result);
                        break;
                    case 2:
                        for (int i = 0; i < widthTriangle; i++) {
                            for (int k = i; k > 0; k--) {
                                result += " ";
                            }
                            for (int j = widthTriangle - i; j > 0; j--) {
                                result += star;
                            }
                            result += "\n";
                        }
                        System.out.println(result);
                        break;
                    case 3:
                        for (int i = 0; i < widthTriangle; i++) {
                            for (int j = i; j > 0; j--) {
                                result += star;
                            }
                            result += "\n";
                        }
                        System.out.println(result);
                        break;
                    case 4:
                        for (int i = 0; i < widthTriangle; i++) {
                            for (int j = i; j < widthTriangle; j++) {
                                result += " ";
                            }
                            for (int k = i; k > 0; k--) {
                                result += star;
                            }
                            result += "\n";
                        }
                        System.out.println(result);
                        break;
                    default:
                        System.out.println("No choices!");
                }
                break;
            case 3:
                System.out.println("Print isosceles triangle");
                System.out.print("Enter height: ");
                int heightIsoTriangle = scanner.nextInt();
                for (int i = 0; i < heightIsoTriangle; i++) {
                    for (int k = 0; k < heightIsoTriangle - i; k++) {
                        result += " ";
                    }
                    for (int j = i; j > 0; j--) {
                        result += star + " ";
                    }
                    result += "\n";
                }
                System.out.println(result);
                break;
            case 4:
                System.out.println("See you again!");
            default:
                System.out.println("No choices!");
        }
    }
}

