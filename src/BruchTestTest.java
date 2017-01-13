import org.junit.Test;
import static org.junit.Assert.*;

public class BruchTestTest {



    @Test
    public void divide() throws Exception {
        BruchTest bruch = new BruchTest();

        int result = bruch.divide(6,6);

        assertEquals("Funktioniert",  1, result);
    }

}