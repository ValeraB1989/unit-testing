package junit;

import com.epam.tat.module4.Calculator;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Test;

public class JUnitTest {
    public static Calculator calculator;

    @BeforeClass
    public static void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void demo() {
        Assert.assertTrue(true);
    }

    @Test
    public void addition () {
        long result = calculator.sum(0,999999999);
                Assert.assertTrue(result == 999999999);
    }

    @Test
    public void addition2 () {
        long result = calculator.sum(-1,2);
                Assert.assertTrue(result == 1);
    }

    @Test
    public void addition3 () {
        double result = calculator.sum(100.555,2.2551);
        Assert.assertTrue(result == 102.8101);
    }

    @Test
    public void sub_actual () {
        double result = calculator.sub(1.2,0.2);
        Assert.assertTrue(result == 1);
    }

    @Test
    public void sub_zero () {
        long result = calculator.sub(1000,1000);
        Assert.assertTrue(result == 0);
    }

    @Test
    public void sub_NO_NULL () {
        long result = calculator.sub(0,0);
        Assert.assertNotNull(result);
    }

    @Test
    public void mult_double () {
        double result = calculator.mult(5.5,2.51);
        Assert.assertTrue(result == 13.805);
    }

    @Test
    public void mult_on_zero () {
        long result = calculator.mult(1,0);
        Assert.assertTrue(result == 0);
    }

    @Test
    public void div_on_zero () {
        long result = calculator.div(100,0);
        Assert.assertFalse(false);
    }

    @Test
    public void div_actual () {
        double result = calculator.div(10.5,2);
        Assert.assertTrue(result == 5.25);
    }

    @Test
    public void pow_actual () {
        double result = calculator.pow(5,2);
        Assert.assertTrue( result == 25.0);
    }


    @AfterClass
    public static void tearDown() {
        calculator = null;
    }
}
