import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before(){
         calculator = new Calculator("calculator");
    }

    @Test
    public void canAdd(){
        assertEquals(8, calculator.add(4, 4));

    }

    @Test
    public void canSubtract(){
        assertEquals(4, calculator.subtract(8, 4));
    }

    @Test
    public void canMultiply(){
        assertEquals(24, calculator.multiply(2, 12));
    }

    @Test
    public void canDivide(){
        assertEquals(10.0, calculator.divide(20.0, 2.0), 0.0);
    }
}
