import java.util.Scanner;

public class MaxIn2DimensionalArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size 1: ");
        byte size1 = checkSize(scanner);
        System.out.print("Enter size 2: ");
        byte size2 = checkSize(scanner);

        byte[][] array = new byte[size1][size2];
        random2DimensionalArray(array);
        byte max = findMax(array);
        System.out.println("Max value is " + max);
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

    private static byte findMax(byte[][] array) {
        byte max = array[0][0];
        for (byte i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        return max;
    }
}
