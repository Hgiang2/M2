import java.util.Scanner;

public class AddArrayIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array size: ");
        byte size = scanner.nextByte();
        size = checkSize(size, scanner);

        byte[] array = new byte[size];
        randomArray(array);
        System.out.print("Enter a value to add: ");
        byte addValue = scanner.nextByte();
        System.out.print("Enter a position to add new value: ");
        byte position = scanner.nextByte();

        byte[] arrayNew = new byte[array.length + 1];
        if (position > array.length) {
            System.out.println("Cannot add value at position " + position);
        } else {
            for (int i = 0, k = 0; i < array.length; i++, k++) {
                if (i != position - 1) {
                    arrayNew[k] = array[i];
                } else {
                    arrayNew[k] = addValue;
                    arrayNew[k + 1] = array[i];
                    k++;
                }
            }
            printNewArray(arrayNew);
        }
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

    private static void randomArray(byte[] array) {
        System.out.println("The current array is: ");
        for (byte i = 0; i < array.length; i++) {
            array[i] = (byte) Math.floor(Math.random() * 10);
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

//    private static byte addValue(byte[] arr, byte position, byte addValue) {
//        byte[] arr2 = new byte[arr.length + 1];
//        if (position > arr.length) {
//            System.out.println("Cannot add value at position " + position);
//        } else {
//            for (int i = 0, k = 0; i < arr.length; i++) {
//                arr[i] = arr2[k];
//
//                if (i == position - 1) {
//                    arr2[k] = addValue;
//                    arr2[k + 1] = arr[i];
//                }
//                k++;
//            }
//            for (byte i:arr2) {
//                System.out.println("New array is: ");
//                System.out.print(i + " ");
//            }
//        }
//        return arr2;
//    }
}
