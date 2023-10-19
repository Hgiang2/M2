public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> numbers = new MyList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }
        System.out.println(numbers.toString());
    }
}