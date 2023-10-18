import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @Test
    void nextDate1() {
        String currentDate = "01/01/2018";
        String expectedDate = "02/01/2018";
        String result = NextDayCalculator.nextDate(currentDate);
        assertEquals(result, expectedDate);
    }

    @Test
    void nextDate2() {
        String currentDate = "31/01/2018";
        String expectedDate = "01/02/2018";
        String result = NextDayCalculator.nextDate(currentDate);
        assertEquals(result, expectedDate);
    }

    @Test
    void nextDate3() {
        String currentDate = "30/04/2018";
        String expectedDate = "01/05/2018";
        String result = NextDayCalculator.nextDate(currentDate);
        assertEquals(result, expectedDate);
    }

    @Test
    void nextDate4() {
        String currentDate = "28/02/2018";
        String expectedDate = "01/03/2018";
        String result = NextDayCalculator.nextDate(currentDate);
        assertEquals(result, expectedDate);
    }


    @Test
    void nextDate5() {
        String currentDate = "29/02/2020";
        String expectedDate = "01/03/2020";
        String result = NextDayCalculator.nextDate(currentDate);
        assertEquals(result, expectedDate);
    }

    @Test
    void nextDate6() {
        String currentDate = "31/12/2018";
        String expectedDate = "01/01/2019";
        String result = NextDayCalculator.nextDate(currentDate);
        assertEquals(result, expectedDate);
    }

}