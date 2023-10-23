import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> paragraph = new HashMap<>();
        String stringInput = "abc xyz dbe abc ";
        String[] words = splitToArray(stringInput);
        alphabeticalSortArray(words);
        countWordsInParagraph(words, paragraph);
        System.out.println(paragraph);
    }

    private static void alphabeticalSortArray(String[] words) {
        Arrays.sort(words);
    }

    private static String[] splitToArray(String stringInput) {
        return stringInput.split(" ");
    }

    private static void countWordsInParagraph(String[] words, Map<String, Integer> paragraph) {
        for (String word : words) {
            Integer integer = paragraph.get(word);
            if (integer == null) {
                paragraph.put(word, 1);
            } else  {
                paragraph.put(word, integer + 1);
            }
        }
    }
}