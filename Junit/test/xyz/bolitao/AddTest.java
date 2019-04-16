package xyz.bolitao;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class AddTest {
    private int input1;
    private int input2;
    private int expected;
    private Add add = null;

    public AddTest(int input1, int input2, int expected) {
        this.input1 = input1;
        this.input2 = input2;
        this.expected = expected;
    }

    @Before
    public void setUp() throws Exception {
        add = new Add();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Parameterized.Parameters
    public static List data() {
        Object[][] objects = {{1, 2, 3}, {3, 4, 7}, {-1, 3, 2}, {2, 2, 4}};
        return Arrays.asList(objects);
    }

    @Test
    public void test() {
        int result = add.add(this.input1, this.input2);
        assertEquals(expected, result);
    }
}