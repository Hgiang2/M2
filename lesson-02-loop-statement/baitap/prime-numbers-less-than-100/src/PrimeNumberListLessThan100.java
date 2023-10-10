import java.util.Scanner;

public class PrimeNumberListLessThan100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter max: ");
        int maxNum = scanner.nextInt();
        int currNum = 2;
        String result = "";
        while (currNum <= maxNum) {
            boolean isPrimeNum = true;
            for (int i = 2; i <= Math.sqrt(currNum); i++) {
                if (currNum % i == 0) {
                    isPrimeNum = false;
                    break;
                }
            }
            if (isPrimeNum) {
                result += currNum + " ";
            }
            currNum++;
        }
        System.out.println(result);
    }
}
