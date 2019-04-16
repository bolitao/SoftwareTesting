package xyz.bolitao;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LargestTest2 {
    Largest largest;

    @Before
    public void setUp() throws Exception {
        largest = new Largest();
    }

    @Test
    public void test() throws Exception {
        Exception exception;
        int arr[] = {1, 2, 3, 4, 5};
        int result = largest.getLargest(arr);
        Assert.assertEquals(5, result);
    }

    @Test
    public void testNull() {
        Exception exception = null;
        int arr[] = null;
        try {
            largest.getLargest(arr);
        } catch (Exception e) {
            exception = e;
        }
        Assert.assertNotNull(exception);
        Assert.assertEquals(Exception.class, exception.getClass());
        Assert.assertEquals("数组不能为空或长度为0", exception.getMessage());
    }

    @Test
    public void testLength() {
        Exception exception = null;
        int arr[] = {};
        try {
            largest.getLargest(arr);
        } catch (Exception e) {
            exception = e;
        }
        Assert.assertNotNull(exception);
        Assert.assertEquals(Exception.class, exception.getClass());
        Assert.assertEquals("数组不能为空或长度为0", exception.getMessage());
    }
}
