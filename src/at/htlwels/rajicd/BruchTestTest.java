package at.htlwels.rajicd;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Dani on 13.01.17.
 */
public class BruchTestTest {
    @Test
    public void divide() throws Exception {
        BruchTest bruch = new BruchTest();

        double result = bruch.divide(5,6);

        assertTrue("Funktioniert", result == 0.8333333333);
    }

}