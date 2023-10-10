import java.util.Scanner;

public class USD_to_VND {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập giá trị USD: ");
        double USD = scanner.nextDouble();

        final double rate = 23000;

        double VND = USD * rate;
        System.out.println(USD + "dUSD bằng " + VND + "VND");
    }
}
