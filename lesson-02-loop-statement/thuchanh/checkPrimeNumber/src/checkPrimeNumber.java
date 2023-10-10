import java.util.Scanner;

public class checkPrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to check: ");
        long num = scanner.nextInt();

        boolean isPrimeNum = true;
        if (num > 2) {
            long i;
            for (i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrimeNum = false;
                    break;
                }
            }
        } else {
            isPrimeNum = false;
        }

        if (isPrimeNum) {
            System.out.printf("%d is a prime number", num);
        } else {
            System.out.printf("%d is NOT a prime number", num);
        }
    }
}
