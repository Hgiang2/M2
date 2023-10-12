//import java.util.Arrays;

import java.util.Random;
import java.util.Scanner;

public class CountCharInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter String length: ");
        int size = checkSize(scanner);
        String[] randomStr = new String[size];
        for (int i = 0; i < randomStr.length; i++) {
            randomStr[i] = randomAlphabeticalString();
        }
        System.out.println("Random string is: ");
        printArray(randomStr);

        String inputChar = scanner.nextLine();
        System.out.print("Enter a character: ");
        String inputChar1 = scanner.nextLine();
        int count = countChar(randomStr, inputChar1);
        System.out.println(inputChar1 + " appears " + count + " times");
    }

    public static void printArray(String[] array) {
        for (String i : array) {
            System.out.print(i);
        }
        System.out.println();
    }

    private static int countChar(String[] randomStr, String inputChar) {
        byte count = 0;
        for (String s : randomStr) {
            if (s.equals(inputChar)) {
                count++;
            }
        }
        return count;
    }

    private static int checkSize(Scanner scanner) {
        int size = scanner.nextByte();
        while (size > 50) {
            System.out.println("Length should not exceed 50");
            size = scanner.nextByte();
        }
        return size;
    }

    private static String randomAlphabeticalString() {
        byte leftLimit = 97;
        byte rightLimit = 122;
        Random random = new Random();

        return random.ints(leftLimit, rightLimit + 1)
                .filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
                .limit(1)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }
}
