import java.util.Objects;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        final String CIRCLE_LEFT_BRACKET = "(";
        final String CIRCLE_RIGHT_BRACKET = ")";
        final String SQUARE_LEFT_BRACKET = "[";
        final String SQUARE_RIGHT_BRACKET = "]";
        final String SQUIGGLY_LEFT_BRACKET = "{";
        final String SQUIGGLY_RIGHT_BRACKET = "}";

        Stack<String> includeBracket = new Stack<>();
        boolean isWellBracket = false;

        String expression = "s * (s – a) * s – b) * (s – c)";
        System.out.println(expression);
        String[] expressionArray = expression.split("", expression.length());

        for (String symbol : expressionArray) {
            if (symbol.equals(CIRCLE_LEFT_BRACKET) || symbol.equals(SQUARE_LEFT_BRACKET) || symbol.equals(SQUIGGLY_LEFT_BRACKET)) {
                includeBracket.push(symbol);
            } else if (symbol.equals(CIRCLE_RIGHT_BRACKET) || symbol.equals(SQUARE_RIGHT_BRACKET) || symbol.equals(SQUIGGLY_RIGHT_BRACKET)) {
                if (!includeBracket.isEmpty()) {
                    String left = includeBracket.pop();
                    // code later

                }

                if (includeBracket.isEmpty()) isWellBracket = true;

                if (isWellBracket) {
                    System.out.println("The expression is well balanced");
                } else {
                    System.out.println("The expression is NOT balanced");
                }
            }
        }
    }