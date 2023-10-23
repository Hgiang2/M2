import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Objects;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        boolean isPalindrome = true;
        String palindromeSample = "able was I ere I saw elba";
        String[] palindromeArray = splitStringToArray(palindromeSample);

        Stack<String> palindromeStack = new Stack<>();
        Queue<String> palindromeQueue = new ArrayDeque<>();
        loopAddElementsToStackQueue(palindromeSample, palindromeStack, palindromeArray, palindromeQueue);

        isPalindrome = checkPalindrome(palindromeSample, palindromeStack, palindromeQueue, isPalindrome);
        isPalindrome(isPalindrome, palindromeSample);
    }

    private static boolean checkPalindrome(String palindromeSample, Stack<String> palindromeStack, Queue<String> palindromeQueue, boolean isPalindrome) {
        String stackPop;
        String queueRemove;
        for (int i = 0; i < palindromeSample.length(); i++) {
            stackPop = palindromeStack.pop();
            queueRemove = palindromeQueue.remove();
            if (!Objects.equals(stackPop, queueRemove)) {
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }

    private static void loopAddElementsToStackQueue(String palindromeSample, Stack<String> palindromeStack, String[] palindromeArray, Queue<String> palindromeQueue) {
        for (int i = 0; i < palindromeSample.length(); i++) {
            palindromeStack.push(palindromeArray[i]);
            palindromeQueue.add(palindromeArray[i]);
        }
    }

    private static String[] splitStringToArray(String palindromeSample) {
        return palindromeSample.split("", palindromeSample.length());
    }

    private static void isPalindrome(boolean isPalindrome, String palindromeSample) {
        if (isPalindrome) {
            System.out.println(palindromeSample + " is a Palindrome");
        } else {
            System.out.println(palindromeSample + " is NOT a Palindrome");
        }
    }
}