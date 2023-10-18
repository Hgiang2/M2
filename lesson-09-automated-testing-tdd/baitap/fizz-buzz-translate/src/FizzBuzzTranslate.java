public class FizzBuzzTranslate {
    final static String[] units = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    final static String[] dozensFrom20 = {"", "", "twenty ", "thirty ", "forty ", "fifty ", "sixty ", "seventy ", "eighty ", "ninety "};
    final static String[] specialsFrom10To19 = {"ten", "eleven", "twelves", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};

    public static String FizzBuzz(int inputNumber) {
        boolean isGreaterThan0 = inputNumber > 0;
        boolean isLessThan100 = inputNumber < 100;
        boolean isDividedBy3 = inputNumber % 3 == 0;
        boolean isDividedBy5 = inputNumber % 5 == 0;
        boolean isContain3 = isNumberContain3(inputNumber);
        boolean isContain5 = isNumberContain5(inputNumber);
        if (isGreaterThan0 & isLessThan100) {
            if (isDividedBy3 && isDividedBy5) {
                return "FizzBuzz";
            } else if (isDividedBy3 || isContain3) {
                return "Fizz";
            } else if (isDividedBy5 || isContain5) {
                return "Buzz";
            } else {
                return numberToString(inputNumber);
            }
        } else {
            return "Not a valid number";
        }
    }

    private static boolean isNumberContain3(int randomNumber) {
        boolean isContain3 = false;
        boolean isContain3InUnit = randomNumber % 10 == 3;
        boolean isContain3InDozen = randomNumber / 10 == 3;
        if (isContain3InUnit || isContain3InDozen) {
            isContain3 = true;
        }
        return isContain3;
    }

    private static boolean isNumberContain5(int randomNumber) {
        boolean isContain5 = false;
        boolean isContain5InUnit = randomNumber % 10 == 5;
        boolean isContain5InDozen = randomNumber / 10 == 5;
        if (isContain5InUnit || isContain5InDozen) {
            isContain5 = true;
        }
        return isContain5;
    }

    public static String numberToString(int randomNumber) {
        int unit = randomNumber % 10;
        int dozen = randomNumber / 10;
        String result = "";
        if (randomNumber > 9 && randomNumber < 20) {
            for (int i = 0; i < 10; i++) {
                if (unit == i) {
                    result += specialsFrom10To19[i];
                    break;
                }
            }
        } else {
            for (int i = 0; i < 10; i++) {
                if (dozen == i) result += dozensFrom20[i];
            }
            for (int i = 0; i < 10; i++) {
                if (unit == i) result += units[i];
            }
        }
        return result;
    }
}

