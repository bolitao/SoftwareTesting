package xyz.bolitao;

import org.junit.*;

import static org.junit.Assert.*;

public class LargestTest {
    Largest largest;

    @BeforeClass
    public static void setUpBeforeClass() {
        System.out.println("@BeforeClass");
    }

    @AfterClass
    public static void tearDownAfterClass() {
        System.out.println("@AfterClass");
    }

    @Before
    public void setUp() throws Exception {
        largest = new Largest();
        System.out.println("@Before");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("@After");
    }

    @Test
    public void getLargest() throws Exception {
        System.out.println("getLargest()");
        int arr[] = new int[]{3, 1, 3, 4, 54, 5, 6};
        int result = largest.getLargest(arr);
        assertEquals(54, result);
    }

    @Test
    public void testNull() {
        System.out.println("testNull()");
        Throwable throwable = null;
        try {
            int arr[] = null;
            largest.getLargest(arr);
            fail("数组为空");
        } catch (Exception e) {
            throwable = e;
        }

        nullOrZeroTest(throwable);
    }

    private void nullOrZeroTest(Throwable throwable) {
        assertNotNull(throwable);
        assertEquals(Exception.class, throwable.getClass());
        assertEquals("数组不能为空或长度为0", throwable.getMessage());
    }

    @Test
    public void testZeroLength() {
        System.out.println("testNull()");
        Throwable throwable = null;
        try {
            int arr[] = {};
            largest.getLargest(arr);
            fail("长度为 0");
        } catch (Exception e) {
            throwable = e;
        }

        nullOrZeroTest(throwable);
    }
}