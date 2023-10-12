import java.util.Scanner;

public class ArrayColumnSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size 1: ");
        byte size1 = checkSize(scanner);
        System.out.print("Enter size 2: ");
        byte size2 = checkSize(scanner);

        byte[][] array = new byte[size1][size2];
        random2DimensionalArray(array);
        System.out.print("Enter the position of the column: ");
        byte columnPos = scanner.nextByte();
        short sum = columnSum(array, columnPos, scanner);
        System.out.println("Sum of column " + columnPos + " is " + sum);
    }

    private static byte checkSize(Scanner scanner) {
        byte size = scanner.nextByte();
        while (size > 10) {
            System.out.println("Size should not exceed 10");
            System.out.println("Enter another array size: ");
            size = scanner.nextByte();
        }
        return size;
    }

    private static void random2DimensionalArray(byte[][] array) {
        System.out.println("The current array is: ");
        for (byte i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (byte) Math.floor(Math.random() * 10);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static short columnSum(byte[][] array, byte columnPos, Scanner scanner) {
        short sum = 0;
        for (byte[] i : array) {
            while (columnPos - 1 > i.length) {
                System.out.println("Column " + columnPos + " is out of reach");
                System.out.print("Please enter another column: ");
                columnPos = scanner.nextByte();
            }
            sum += i[columnPos - 1];
        }
        return sum;
    }
}
