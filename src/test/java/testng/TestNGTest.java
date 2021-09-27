package testng;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGTest {

    public Calculator calculator;

    @BeforeClass
	public void setUp() {
		calculator = new Calculator();
	}

	@Test
	public void demo() {
		Assert.assertFalse(false);
	}

	@Test(dataProvider = "dataProviderForSqrt")
	public void testSqrtDataProvider (double a, double expectedResult) throws Exception {
		double result = calculator.sqrt(a);
		Assert.assertEquals(result,expectedResult,"Invalid result sqrt" + expectedResult);
	}

	@DataProvider(name = "dataProviderForSqrt")
	public Object[][] dataProviderSqrt() {
		return new Object[][] {
				{64,8},
				{2.25,1.500},
				{0.25,0.500}};
		}


	@Test(dataProvider = "dataProviderForTg")
	public void testTgDataProvider (double a, double expectedResult) throws Exception {
	double result = calculator.tg(a);
	Assert.assertEquals(result,expectedResult,"Invalid result tg" + expectedResult);
	}

	@DataProvider(name="dataProviderForTg")
	public Object[][] dataProviderTg() {
	return new Object[][] {
			{0.0, 0.0000},
			{180, -0.0000}};
	}

	@Test(dataProvider = "dataProviderForCtg")
	public void testCtgDataProvider (double a, double expectedResult) throws Exception {
		double result = calculator.ctg(a);
		Assert.assertEquals(result,expectedResult,"Invalid result ctg" + expectedResult);
	}

	@DataProvider(name="dataProviderForCtg")
	public Object[][] dataProviderCtg() {
		return new Object[][] {
				{60, 0.58}};
	}

	@Test(dataProvider = "dataProviderForCos")
	public void testCosDataProvider (double a, double expectedResult) throws Exception {
		double result = calculator.cos(a);
		Assert.assertEquals(result,expectedResult,"Invalid result cos" + expectedResult);
	}

	@DataProvider(name="dataProviderForCos")
	public Object[][] dataProviderCos() {
		return new Object[][] {
				{180, -1.0000},
				{0.0, 1}};
	}

	@Test(dataProvider = "dataProviderForSin")
	public void testSinDataProvider (double a, double expectedResult) throws Exception {
		double result = calculator.sin(a);
		Assert.assertEquals(result,expectedResult,"Invalid result sin" + expectedResult);
	}

	@DataProvider(name="dataProviderForSin")
	public Object[][] dataProviderSin() {
		return new Object[][] {
				{0.0, 0.00000},
				{90, 1.0000},
				{360, -0.0000}};
	}

	@AfterClass
	public void tearDown() {
		calculator = null;
		}
	}

