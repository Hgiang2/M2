public class TriangleClassifier {
    public static String TriangleClassification (int side1, int side2, int side3) {
        String result;
        if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1 && side1 > 0 && side2 > 0 && side3 > 0)
        {
            if (side1 == side2 && side2 == side3) {
                result = "Tam giác đều";
            } else if (side1 == side2 || side2 == side3 || side1 == side3) {
                result = "Tam giác cân";
            } else {
                result = "Tam giác thường";
            }
        } else {
            result = "Không phải là tam giác";
        }
        return result;
    }
}
