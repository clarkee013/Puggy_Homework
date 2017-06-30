package example.codeclan.com.puggy;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 30/06/2017.
 */

public class PlayerTest {

    Player player;

    @Before
    public void before() throws Exception{
        player = new Player(5);
    }

    @Test
    public void canGetMoney(){
        assertEquals(5, player.getMoney());
    }

}
