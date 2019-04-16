package xyz.bolitao;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class XTest {
    private int a, b, expected;
    private X x;

    public XTest(int a, int b, int expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @Before
    public void setUp() throws Exception {
        x = new X();
    }

    @Parameterized.Parameters
    public static List data() {
        Object[][] objects = {{1, 2, 2}, {2, 2, 4}, {2, 5, 10}, {-1, 2, -2}};
        return Arrays.asList(objects);
    }

    @Test
    public void x() {
        int result = x.x(this.a, this.b);
        assertEquals(expected, result);
    }
}