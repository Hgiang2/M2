import java.util.Scanner;

public class First20PrimeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng số nguyên tố cần hiển thị: ");
        PrimeNumberList primeNumberList = new PrimeNumberList();

        String result = primeNumberList.getPrimeNumberList(scanner.nextShort());
        System.out.println(result);
    }

}