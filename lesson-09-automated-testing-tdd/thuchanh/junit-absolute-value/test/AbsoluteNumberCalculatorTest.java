import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbsoluteNumberCalculatorTest {
    @Test
    void findAbsolute0() {
        int input = 0;
        int expect = 0;
        int result = AbsoluteNumberCalculator.findAbsolute(input);
        assertEquals(result, expect);
    }
    @Test
    void findAbsoluteNegativeInteger() {
        int input = -1;
        int expect = 1;
        int result = AbsoluteNumberCalculator.findAbsolute(input);
        assertEquals(result, expect);
    }
    @Test
    void findAbsolutePositiveInteger() {
        int input = 2;
        int expect = 2;
        int result = AbsoluteNumberCalculator.findAbsolute(input);
        assertEquals(result, expect);
    }
}