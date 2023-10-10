package src;

import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập lượng tiền vay (VND): ");
        double base = scanner.nextInt();
        System.out.println("Nhập lãi suất (%/năm): ");
        float rate = scanner.nextInt();
        System.out.println("Nhập số tháng cho vay: ");
        int month = scanner.nextInt();

        //Số_tiền_lãi = Số_tiền_gửi *  tỉ_lệ_lãi_suất (% năm) / 12 * số_tháng_gửi
        double result = base * rate / 100 / 12 * month;

        System.out.printf("Số tiền lãi là %s", result);
    }
}
