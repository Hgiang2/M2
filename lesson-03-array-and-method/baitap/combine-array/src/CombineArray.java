import java.util.Scanner;

public class CombineArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of array 1: ");
        byte size1 = checkSize(scanner);
        byte[] arr1 = new byte[size1];
        randomArray(arr1);
        System.out.print("Enter the size of array 2: ");
        byte size2 = checkSize(scanner);
        byte[] arr2 = new byte[size2];
        randomArray(arr2);

        byte[] arr3 = new byte[arr1.length + arr2.length];
        arrayCopy1(arr3, arr1);
        arrayCopy2(arr3, arr2, arr1);
        printNewArray(arr3);
    }

    private static void arrayCopy1(byte[] arr3, byte[] arr1) {
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
    }

    private static void arrayCopy2(byte[] arr3, byte[] arr2, byte[] arr1) {
        for (int i = 0; i < arr2.length; i++) {
            arr3[arr1.length + i] = arr2[i];
        }
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

    private static void printNewArray(byte[] arrayNew) {
        System.out.println("New array is ");
        for (byte b : arrayNew) {
            System.out.print(b + " ");
        }
        System.out.println();
    }

    private static void randomArray(byte[] array) {
        System.out.println("The current array is: ");
        for (byte i = 0; i < array.length; i++) {
            array[i] = (byte) Math.floor(Math.random() * 10);
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
