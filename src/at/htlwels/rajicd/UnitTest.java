package at.htlwels.rajicd;

import org.junit.Test;
import static org.junit.Assert.*;

public class UnitTest {

    @Test
    public void testConcatenate() {
        BruchTest bruch = new BruchTest();

        double result = bruch.divide(5,6);

        assertTrue("Funktioniert", result == 0.8333333333);
    }

}
