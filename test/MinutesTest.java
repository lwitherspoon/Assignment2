import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MinutesTest {

    @Test
    public void displayMinutesConversion() {
        int mins = 10000000;
        int years = 1902;
        int days = 214;

        String expected = mins + " minutes is approximately 1902 years and 214 days.";

        Minutes minutes = new Minutes();
        assertEquals("Minutes not converted correctly", expected, minutes.displayMinutesConversion(mins, years, days));
    }

}