import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterBottle;

    @Before
    public void before(){
        waterBottle = new WaterBottle("Volvic", 100);
    }

    @Test
    public void canDrink(){
        waterBottle.drink();
        assertEquals(90, waterBottle.getVolume());

    }

    @Test
    public void canEmptyBottle(){
        waterBottle.fill();
        waterBottle.empty();
        assertEquals(0, waterBottle.getVolume());
    }

    @Test
    public void canFillBottle(){
        waterBottle.empty();
        waterBottle.fill();
        assertEquals(100, waterBottle.getVolume());
    }

    @Test
    public void cantBeLessThanZero(){
        waterBottle.empty();
        waterBottle.drink();
        assertEquals(0, waterBottle.getVolume());
    }


}
