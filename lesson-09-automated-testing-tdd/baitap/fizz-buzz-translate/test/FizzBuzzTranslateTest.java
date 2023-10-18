import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTranslateTest {

    @Test
    void fizzBuzz33() {
        String expectedResult = "Fizz";
        String result = FizzBuzzTranslate.FizzBuzz(33);
        assertEquals(expectedResult, result);
    }

    @Test
    void fizzBuzz15() {
        String expectedResult = "FizzBuzz";
        String result = FizzBuzzTranslate.FizzBuzz(15);
        assertEquals(expectedResult, result);
    }

    @Test
    void fizzBuzz99() {
        String expectedResult = "Fizz";
        String result = FizzBuzzTranslate.FizzBuzz(99);
        assertEquals(expectedResult, result);
    }

    @Test
    void fizzBuzz50() {
        String expectedResult = "Buzz";
        String result = FizzBuzzTranslate.FizzBuzz(50);
        assertEquals(expectedResult, result);
    }
}