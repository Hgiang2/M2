import java.util.Scanner;

public class QueueClient {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the queue size (below 20): ");
        int size = input.nextInt();
        size = checkSize(size, 20, input);
        MyQueue numbers = new MyQueue(size);
        enqueueRandomNumbers(size, numbers);
//        System.out.println(numbers);
//        printQueue(numbers, size, 0);
//
        System.out.print("Enter number of elements to delete: ");
        int deleteCount = input.nextInt();
        deleteCount = checkSize(deleteCount, size, input);
        dequeueCount(deleteCount, numbers);
//        printQueue(numbers, size, deleteCount);
    }

    private static void dequeueCount(int deleteCount, MyQueue numbers) {
        for (int i = 0; i < deleteCount; i++) {
            numbers.dequeue();
        }
    }

    private static void enqueueRandomNumbers(int size, MyQueue numbers) {
        for (int i = 0; i < size; i++) {
            numbers.enqueue((int) Math.floor(Math.random() * 50));
        }
    }

    private static int checkSize(int size, int max, Scanner input) {
        while (size > max || size <= 0) {
            System.out.print("Enter another number: ");
            size = input.nextInt();
        }
        return size;
    }

//    private static void printQueue(MyQueue numbers, int size, int deleteCount) {
//        for (int i = 0; i < size - deleteCount; i++) {
//            System.out.println(numbers[i] + " ");
//        }
//    }
}
