import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindMaxStringLength {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a random string: ");
        String string = SCANNER.nextLine();

        List<Character> maxString = findMaxString(string);

        System.out.print("Max sorted string is:  ");
        printList(maxString);
    }

    private static void printList(List<Character> maxString) {
        for (Character character : maxString) {
            System.out.print(character);
        }
    }

    private static List<Character> findMaxString(String string) {
        List<Character> maxString = new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            List<Character> arrayString = new ArrayList<>();
            arrayString.add(string.charAt(i));
            for (int j = i + 1; j < string.length(); j++) {
                if (arrayString.getLast() < string.charAt(j)) {
                    arrayString.add(string.charAt(j));
                }
            }

            if (arrayString.size() > maxString.size()) {
                maxString.clear();
                maxString.addAll(arrayString);
            }
            arrayString.clear();
        }
        return maxString;
    }
}
