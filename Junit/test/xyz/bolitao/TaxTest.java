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
public class TaxTest {

    @Before
    public void setUp() throws Exception {
        tax = new Tax();
    }

    @After
    public void tearDown() throws Exception {
    }

    private Tax tax = null;
    private double mySalary;
    private double myTax;

    public TaxTest(double mySalary, double myTax) {
        this.mySalary = mySalary;
        this.myTax = myTax;
    }

    @Parameterized.Parameters
    public static List<Object[]> data() {
//    public static List data() {
        Object[][] objects = {{0.0, 0.0}, {-100.0, 0.0}, {2000, 0},
                {2001.0, 0.05}, {2200.0, 10.0}, {2500.0, 25.0}, {2501.0, 25.1},
                {2600.0, 35.0}, {4000.0, 175.0}, {4001.0, 175.15}, {4500.0, 250.0},
                {7000.0, 625.0}, {7001.0, 625.2}, {7500, 725.0}, {22000, 3625.0}, {22001, 3625.25},
                {30000, 5625.0}, {42000, 8625.0}, {42001, 8625.3}, {60000, 14025.0}, {62000, 14625.0}, {62001, 14625.35},
                {75000, 19175.0}, {82000, 21625.0}, {82001, 21625.4}, {98000, 28025.0}, {102000, 29625.0}, {102001, 29625.45},
                {200000, 73725.0}};
        return Arrays.asList(objects);
    }

    @Test
    public void test() {
        double result = tax.countTax(this.mySalary);
        assertEquals(this.myTax, result, 0.000);
//        fail("Not completed yet.");
    }
}