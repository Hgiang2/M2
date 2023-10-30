import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class BinarySearch {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter array size: ");
        int size = SCANNER.nextInt();

        int[] array = randomSortedArrayList(size);
        System.out.println("Current array: " + Arrays.toString(array));

        System.out.print("Enter a value to search: ");
        int value = SCANNER.nextInt();
        int index = binarySearch(array, 0, array.length - 1, value);

        if (index != -1) {
            System.out.println("Value " + value + " found at index " + index);
        } else {
            System.out.println("Value not found!");
        }
    }

    private static int[] randomSortedArrayList(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) Math.floor(Math.random() * 100);
        }
        Arrays.sort(array);
        return array;
    }

    private static int binarySearch(int[] array, int left, int right, int value) {
        while (right >= left) {
            int middle = (left + right) / 2;
            if (array[middle] == value) {
                return middle;
            } else if (array[middle] > value) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return -1;
    }
}
