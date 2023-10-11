import java.util.Scanner;

public class MinInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size: ");
        byte size = checkSize(scanner);

        byte[] array = new byte[size];
        randomArray(array);
        byte min = findMin(array);
        System.out.println("Min value is " + min);
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

    private static void randomArray(byte[] array) {
        System.out.println("The current array is: ");
        for (byte i = 0; i < array.length; i++) {
            array[i] = (byte) Math.floor(Math.random() * 10);
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    private static byte findMin(byte[] array) {
        byte min = array[0];
        for (byte i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
