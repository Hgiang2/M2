import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        for (int i = 1; i <= num; i++) {
            String result = FizzBuzzTranslate.FizzBuzz(i);
            System.out.println(result);
        }
    }
}