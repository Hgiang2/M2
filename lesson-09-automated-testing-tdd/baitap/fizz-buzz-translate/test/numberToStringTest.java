import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class numberToStringTest {

    @Test
    void numberToString91() {
        String expectedResult = "ninety one";
        String result = FizzBuzzTranslate.numberToString(91);
        assertEquals(result, expectedResult);
    }

    @Test
    void numberToString33() {
        String expectedResult = "thirty three";
        String result = FizzBuzzTranslate.numberToString(33);
        assertEquals(result, expectedResult);
    }

    @Test
    void numberToString10() {
        String expectedResult = "ten";
        String result = FizzBuzzTranslate.numberToString(10);
        assertEquals(result, expectedResult);
    }

    @Test
    void numberToString66() {
        String expectedResult = "sixty six";
        String result = FizzBuzzTranslate.numberToString(66);
        assertEquals(result, expectedResult);
    }
}