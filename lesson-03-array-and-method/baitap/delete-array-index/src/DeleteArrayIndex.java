import java.util.Scanner;

public class DeleteArrayIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array size: ");
        byte size = scanner.nextByte();
        size = checkSize(size, scanner);

        byte[] array = new byte[size];
        randomArray(array);
        System.out.print("Enter a value to delete: ");
        byte deleteValue = scanner.nextByte();

        byte count = deleteValue(array, deleteValue);

        byte[] arrayNew = new byte[array.length - count];
        newDeleteArray(array, deleteValue, arrayNew);
        printNewArray(arrayNew);
    }

    private static byte checkSize(byte size, Scanner scanner) {
        while (size > 10) {
            System.out.println("Size should not exceed 10");
            System.out.println("Enter another array size: ");
            size = scanner.nextByte();
        }
        return size;
    }

    private static void printNewArray(byte[] arrayNew) {
        System.out.println("New array is ");
        for (byte b : arrayNew) {
            System.out.print(b + " ");
        }
        System.out.println();
    }

    private static void newDeleteArray(byte[] array, byte deleteValue, byte[] arrayNew) {

        for (int i = 0, k = 0; i < array.length; i++) {
            if (array[i] != deleteValue) {
                arrayNew[k] = array[i];
                k++;
            }
        }
    }

    private static void randomArray(byte[] array) {
        System.out.println("The current array is: ");
        for (byte i = 0; i < array.length; i++) {
            array[i] = (byte) Math.floor(Math.random() * 10);
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    private static byte deleteValue(byte[] arr, byte deleteValue) {
        byte count = 0;
        for (byte i : arr) {
            if (i == deleteValue) {
                count++;
            }
        }
        if (count == 0)  System.out.println("Value not found!");
        return count;
    }
}

