import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle bottle;

    @Before
    public void before(){
        bottle = new WaterBottle();
    }

    @Test
    public void testVolume(){
        assertEquals(100, bottle.getVolume());
    }


    @Test
    public void testCanDrink(){
        assertEquals(90, bottle.drink());
    }

    @Test
    public void testCanEmpty(){
        assertEquals(0, bottle.empty());
    }

    @Test
    public void testCanFill(){
        bottle.empty();
        assertEquals(100, bottle.fill());
    }
}
