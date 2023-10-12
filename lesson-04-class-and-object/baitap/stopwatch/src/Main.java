import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        StopWatch numberSortTiming = new StopWatch();
        numberSortTiming.start();
        numberSort();
        numberSortTiming.end();
        System.out.println();
        System.out.println("Running time is " + numberSortTiming.getElapsedTime());
    }

    private static void numberSort() {
        int[] numbers = new int[100000];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) Math.floor(Math.random() * 500000);
        }
        Arrays.sort(numbers);
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}