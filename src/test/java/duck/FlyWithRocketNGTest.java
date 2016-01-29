package duck;

import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author pasoktummarungsri
 */
public class FlyWithRocketNGTest {
    
    public FlyWithRocketNGTest() {
    }

    @Test
    public void testDoFlyCaseSuccess() {
        FlyBehavior fly = new FlyWithRocket();
        assertEquals(fly.doFly(), "========>");
    }
    
}
