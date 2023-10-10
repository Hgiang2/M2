import java.util.Scanner;

public class UCLN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số nguyên a: ");
        long a = Math.abs(scanner.nextInt());
        System.out.println("Nhập số nguyên b: ");
        long b = Math.abs(scanner.nextInt());

        if (a != 0 & b != 0) {
            long i;
            long max = 1;
            for (i = 1; i <= a; i++) {
                if (a % i == 0 && b % i == 0) {
                    max = i;
                }
            }
            System.out.println("UCLN là " + max);
        } else {
            if (a == 0 && b == 0) {
                System.out.println("Không tồn tại UCLN");
            } else if (a != 0) {
                System.out.println("UCLN là " + a);
            } else {
                System.out.println("UCLN là " + b);
            }
        }
    }
}
