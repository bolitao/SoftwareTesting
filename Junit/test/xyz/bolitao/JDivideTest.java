package xyz.bolitao;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class JDivideTest {
    JDivide divide;

    @Test
    public void divide() {
        divide = new JDivide();
        int result = divide.divide(16, 8);
        Assert.assertEquals(2, result);
    }

    //    @Test(expected = ArithmeticException.class)
    @Test
    public void testDivideZero() {
        divide = new JDivide();
        Exception exception = null;
        try {
            divide.divide(1, 0);
//            fail("?");

        } catch (Exception e) {
            exception = e;
        }
        assertEquals(ArithmeticException.class, exception.getClass());
    }
}