import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       var scanner = new Scanner(System.in);
        System.out.println("Input a,b,c");
        QuadraticEquation quadraticEquation = new QuadraticEquation(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
        quadraticEquation.calculateResult();

    }
}