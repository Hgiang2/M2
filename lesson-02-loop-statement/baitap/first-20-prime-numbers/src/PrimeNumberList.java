public class PrimeNumberList {
    public  String getPrimeNumberList(short numbers) {
        short count = 0;
        String result = "";
        int currNum = 2;
        while (count < numbers) {
            if (isPrimeNumber(currNum)) {
                result += currNum + " ";
                count++;
            }
            currNum++;
        }
        return result;
    }

    public boolean isPrimeNumber(int currNum) {
        boolean isPrimeNumber = true;
        for (int i = 2; i <= Math.sqrt(currNum); i++) {
            if (currNum % i == 0) {
                isPrimeNumber = false;
                break;
            }
        }
        return isPrimeNumber;
    }
}
