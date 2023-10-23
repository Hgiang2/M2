import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        for (int i = 0; i < 10; i++) {
            stack1.add(i);
        }
        System.out.println(stack1.toString());
        LinkedList<Integer> linkedList = new LinkedList<>();
        int stack_size = stack1.size();
        for (int i = 0; i < stack_size; i++) {
            linkedList.add(i, stack1.pop());
        }
        System.out.println(stack1.toString());
        System.out.println(linkedList.toString());
        linkedList.sort((a, b) -> a - b);
        System.out.println(linkedList.toString());
    }
}