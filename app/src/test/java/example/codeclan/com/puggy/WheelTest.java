package example.codeclan.com.puggy;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 30/06/2017.
 */

public class WheelTest {

    Wheel wheel;

    @Before
    public void before() {
        wheel = new Wheel();
    }

    @Test
    public void canGetBarrelSize() throws Exception {
        assertEquals(7, wheel.getBarrelSize());
    }

    @Test
    public void canSpinBarrel() throws Exception {

    }
}




