import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;
import java.util.Timer;

public class AlgorithmComplexityTest {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter a random string: ");
        String inputString = SCANNER.nextLine();

        frequencyMaxCalculator(inputString);

        complexityCalculator(inputString);
    }

    private static void frequencyMaxCalculator(String inputString) {
        int[] frequentChar = new int[255];                         //{1}
        for (int i = 0; i < inputString.length(); i++) {           //{2}
            int ascii = (int) inputString.charAt(i);               //{3}
            frequentChar[ascii] += 1;                              //{4}
        }

        int max = 0;                                             //{5}
        char character = (char) 255;                             //{6}
        for (int j = 0; j < 255; j++) {                         //{7}
            if (frequentChar[j] > max) {                        //{8}
                max = frequentChar[j];                          //{9}
                character = (char) j;                           //{10}
            }
        }
        System.out.println("The most appearing letter is '" + character + "' with a frequency of " + max + " times");
    }

    private static void complexityCalculator(String string) {
        int n = string.length();
        if (n > 255) {
            System.out.printf("Complexity: O(\n)", n);
        } else {
            System.out.printf("Complexity: O(255)");

        }

    }
}
