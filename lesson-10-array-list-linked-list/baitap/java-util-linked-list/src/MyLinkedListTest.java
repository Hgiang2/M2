public class MyLinkedListTest {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList ll = new MyLinkedList(10);
        ll.addFirst(0);
        ll.addFirst(1);
        ll.addFirst(3);

        ll.add(3,9);
        ll.add(4,7);
        ll.printList();
    }
}