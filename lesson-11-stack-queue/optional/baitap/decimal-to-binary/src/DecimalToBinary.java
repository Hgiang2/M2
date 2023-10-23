import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
    public static void main(String[] args) {
        Stack<Integer> remainders = new Stack<>();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int inputNumber = input.nextInt();

        while (inputNumber / 2 != 0) {
            remainders.push(inputNumber % 2);
            inputNumber /= 2;
        }

        System.out.print("Binary code: ");
        for (Integer remainder : remainders) {
            System.out.print(remainder);
        }
    }
}