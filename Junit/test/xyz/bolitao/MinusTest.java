package xyz.bolitao;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class MinusTest {
    private int input1;
    private int input2;
    private int expected;
    private Minus minus = null;

    public MinusTest(int input1, int input2, int expected) {
        this.input1 = input1;
        this.input2 = input2;
        this.expected = expected;
    }

    @Before
    public void setUp() throws Exception {
        minus = new Minus();
    }

    @Parameterized.Parameters
    public static List data() {
        Object[][] objects = {{1, 2, -1}, {3, 1, 2}, {4, 4, 0}, {2, 1, 1}};
        return Arrays.asList(objects);
    }

    @Test
    public void minus() {
        int result = minus.minus(input1, input2);
        assertEquals(expected, result);
    }
}