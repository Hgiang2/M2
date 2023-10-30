import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindMaxStringLength {
    public final static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter a string: ");
        String inputString = SCANNER.nextLine();


        List<Character> max = findMaxString(inputString);

        printArrayList(max);

        complexityCalculator(inputString);
    }

    private static List<Character> findMaxString(String inputString) {
        List<Character> max = new ArrayList<>();
        List<Character> arrayString = new ArrayList<>();
        for (int i = 0; i < inputString.length(); i++) {
            arrayString.add(inputString.charAt(i));
            for (int j = i + 1; j < inputString.length(); j++) {
                if (arrayString.getLast() < inputString.charAt(j)) {
                    arrayString.add(inputString.charAt(j));
                }
            }
            if (arrayString.size() > max.size()) {
                max.clear();
                max.addAll(arrayString);
            }
            arrayString.clear();
        }
        return max;
    }

    private static void printArrayList(List<Character> max) {
        System.out.print("Max string: ");
        for (Character character : max) {
            System.out.print(character);
        }
        System.out.println();
    }

    private static void complexityCalculator(String inputString) {
        int n = inputString.length();
        System.out.println("Complexity: O(" + n + "^2)");
    }
}
