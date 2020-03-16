import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void testAdd(){
        assertEquals(6, calculator.add(3, 3));
    }

    @Test
    public void testSubtract(){
        assertEquals(4, calculator.subtract(8, 4));
    }

    @Test
    public void testMultiply(){
        assertEquals(8, calculator.multiply(4, 2));
    }

    @Test
    public void testDivide(){
        assertEquals(1.5, calculator.divide(3.0, 2.0), 1.0);
    }

}
