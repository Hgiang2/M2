import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {
    @Test
    void triangleClassification1() {
        int side1 = 2;
        int side2 = 2;
        int side3 = 2;
        String expectedResult = "Tam giác đều";
        String result = TriangleClassifier.TriangleClassification(side1, side2, side3);
        assertEquals(expectedResult, result);
    }

    @Test
    void triangleClassification2() {
        int side1 = 8;
        int side2 = 2;
        int side3 = 3;
        String expectedResult = "Không phải là tam giác";
        String result = TriangleClassifier.TriangleClassification(side1, side2, side3);
        assertEquals(expectedResult, result);
    }

    @Test
    void triangleClassification3() {
        int side1 = 2;
        int side2 = 2;
        int side3 = 3;
        String expectedResult = "Tam giác cân";
        String result = TriangleClassifier.TriangleClassification(side1, side2, side3);
        assertEquals(expectedResult, result);
    }

    @Test
    void triangleClassification4() {
        int side1 = 3;
        int side2 = 4;
        int side3 = 5;
        String expectedResult = "Tam giác thường";
        String result = TriangleClassifier.TriangleClassification(side1, side2, side3);
        assertEquals(expectedResult, result);
    }

    @Test
    void triangleClassification5() {
        int side1 = -1;
        int side2 = 2;
        int side3 = 1;
        String expectedResult = "Không phải là tam giác";
        String result = TriangleClassifier.TriangleClassification(side1, side2, side3);
        assertEquals(expectedResult, result);
    }

    @Test
    void triangleClassification6() {
        int side1 = 0;
        int side2 = 1;
        int side3 = 1;
        String expectedResult = "Không phải là tam giác";
        String result = TriangleClassifier.TriangleClassification(side1, side2, side3);
        assertEquals(expectedResult, result);
    }
}