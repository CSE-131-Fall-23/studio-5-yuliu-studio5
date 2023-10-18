package studio5.tests;

import static org.junit.Assert.assertEquals;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import studio5.Methods;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ArraySumPreliminaryTest {
	@Test
	public void testArrayLength0() {
		int[] values = {};
		int actual = Methods.arraySum(values);
		int expected = 0;
		assertEquals(expected, actual);
	}

	@Test
	public void testArrayLength1() {
		int[] values = { 42 };
		int actual = Methods.arraySum(values);
		int expected = values[0];
		assertEquals(expected, actual);
	}

	@Test
	public void testArrayLength2() {
		int[] values = { 10, 20 };
		int actual = Methods.arraySum(values);
		int expected = 30;
		assertEquals(expected, actual);
	}

	@Test
	public void testArrayLength4() {
		int[] values = { 2, 4, 6, 8 };
		int actual = Methods.arraySum(values);
		int expected = 20;
		assertEquals(expected, actual);
	}
}
