package studio5.tests;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import studio5.Methods;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class FilledArrayPreliminaryTest {
	@Test
	public void testArrayLength0() {
		int length = 0;
		int ignored = 16;
		int[] actuals = Methods.filledArray(length, ignored);
		assertNotNull(actuals);
		assertEquals(length, actuals.length);
		int[] expecteds = {};
		assertArrayEquals(expecteds, actuals);
	}

	@Test
	public void testArrayLength1() {
		int length = 1;
		int value = 42;
		int[] actuals = Methods.filledArray(length, value);
		assertNotNull(actuals);
		assertEquals(length, actuals.length);
		int[] expecteds = { value };
		assertArrayEquals(expecteds, actuals);
	}

	@Test
	public void testArrayLength2() {
		int length = 2;
		int value = 4;
		int[] actuals = Methods.filledArray(length, value);
		assertNotNull(actuals);
		assertEquals(value, actuals.length); // Incorrect: FIXME!
		int[] expecteds = { value, value };
		assertArrayEquals(expecteds, actuals);
	}

	@Test
	public void testArrayLength4() {
		int length = 4;
		int value = 400;
		int[] actuals = Methods.filledArray(length, value);
		assertNotNull(actuals);
		assertEquals(length, actuals.length);
		int[] expecteds = { value, value, value, value };
		assertArrayEquals(expecteds, actuals);
	}
}
