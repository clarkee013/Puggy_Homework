package example.codeclan.com.puggy;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.*;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 30/06/2017.
 */

public class WheelTest {

    Wheel wheel1;
    Wheel wheel2;
    Wheel wheel3;
    Wheel spyWheel;


    @Before
    public void before() {
        wheel1 = new Wheel();
        wheel2 = new Wheel();
        wheel3 = new Wheel();
    }

    @Test
    public void canGetWheel1Size() throws Exception {
        assertEquals(7, wheel1.getWheel1Size());
    }

    @Test
    public void canGetWheel2Size() throws Exception {
        assertEquals(7, wheel2.getWheel2Size());
    }

    @Test
    public void canGetWheel3Size() throws Exception {
        assertEquals(7, wheel3.getWheel3Size());
    }

//    @Test
//    public void canGetAllSpinResultSize() throws Exception {
//        assertEquals(3, Wheel.getSpinResultSize());
//    }



}




