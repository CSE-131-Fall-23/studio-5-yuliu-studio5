package studio5.tests;

import static org.junit.Assert.assertEquals;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ArrayMeanPreliminaryTest {
	@Test
	public void testArrayLength1() throws Exception {
		int[] values = { 42 };
		double actual = Reflections.invokeArrayMean(values);
		double expected = 42.0;
		double acceptableDifference = 0.00001;
		assertEquals(expected, actual, acceptableDifference);
	}

	@Test
	public void testArrayLength2() throws Exception {
		int[] values = { 10, 20 };
		double actual = Reflections.invokeArrayMean(values);
		double expected = 15.0;
		double acceptableDifference = 0.00001;
		assertEquals(expected, actual, acceptableDifference);
	}

	@Test
	public void testArrayLength4() throws Exception {
		int[] values = { 2, 4, 6, 8 };
		double actual = Reflections.invokeArrayMean(values);
		double expected = 5.0;
		double acceptableDifference = 0.00001;
		assertEquals(expected, actual, acceptableDifference);
	}
}
