package studio5.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import studio5.Methods;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
@RunWith(Parameterized.class)
public class FilledArraySumAndMeanComprehensiveTest {
	private final int length;
	private final int value;

	public FilledArraySumAndMeanComprehensiveTest(int length, int value) {
		this.length = length;
		this.value = value;
	}

	@Test
	public void test() throws Exception {
		int[] values = Methods.filledArray(length, value);
		assertNotNull(values);
		assertEquals(length, values.length);
		for (int i = 0; i < values.length; ++i) {
			assertEquals("at index [" + i + "]", value, values[i]);
		}

		int actualSum = Methods.arraySum(values);
		int expectedSum = length * value;
		assertEquals(expectedSum, actualSum);

		double actualMean = Reflections.invokeArrayMean(values);
		double expectedMean = value;
		double acceptableDelta = 0.0001;
		assertEquals(actualMean, expectedMean, acceptableDelta);
	}

	@Parameterized.Parameters(name = "length: {0}; value: {1}")
	public static Collection<Object[]> getConstructorArguments() {
		return ComprehensiveTestCases.createFilledArrayTestCases();
	}
}
