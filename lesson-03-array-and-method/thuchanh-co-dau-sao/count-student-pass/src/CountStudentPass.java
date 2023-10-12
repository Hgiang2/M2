import java.util.Scanner;

public class CountStudentPass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng sinh viên: ");
        byte size = checkSize(scanner);

        byte[] studentGrades = new byte[size];
        randomArray(studentGrades);
        System.out.println("Danh sách điểm các sinh viên: ");
        printArray(studentGrades);

        byte count = countPassStudents(studentGrades);
        System.out.println("Số lượng sinh viên đỗ là " + count);
    }
    private static byte checkSize(Scanner scanner) {
        byte size = scanner.nextByte();
        while (size > 30) {
            System.out.println("Số lượng không vượt quá 30");
            System.out.print("Nhập lại số lượng sinh viên: ");
            size = scanner.nextByte();
        }
        return size;
    }

    private static void randomArray(byte[] array) {
        for (byte i = 0; i < array.length; i++) {
            array[i] = (byte) Math.floor(Math.random() * 10);
        }
    }

    private static void printArray(byte[] array) {
        for (byte i: array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static byte countPassStudents(byte[] array) {
        byte count = 0;
        for (byte i: array) {
            if (i >= 5) {
                count++;
            }
        }
        return count;
    }
}
