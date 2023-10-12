import java.util.Scanner;

public class DiagonalSumSquare2DimentionalArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter square 2-dimensional array size : ");
        byte size = checkSize(scanner);

        byte[][] array = new byte[size][size];
        random2DimensionalArray(array);
        short sum = diagonalSum(array);
        System.out.println("Sum is " + sum);
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

    private static short diagonalSum(byte[][] array) {
        short sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i][i];
        }
        return sum;
    }
}
