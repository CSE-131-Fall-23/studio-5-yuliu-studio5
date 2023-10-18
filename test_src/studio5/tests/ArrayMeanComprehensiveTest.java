package studio5.tests;

import static org.junit.Assert.assertEquals;

import java.util.Collection;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import support.cse131.PrimitiveArrays;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
@RunWith(Parameterized.class)
public class ArrayMeanComprehensiveTest {
	private final int[] values;
	private final double expected;

	public ArrayMeanComprehensiveTest(List<Integer> values, double expected) {
		this.values = PrimitiveArrays.toIntArray(values);
		this.expected = expected;
	}

	@Test
	public void test() throws Exception {
		double actual = Reflections.invokeArrayMean(values);
		double acceptableDifference = 0.00001;
		assertEquals(expected, actual, acceptableDifference);
	}

	@Parameterized.Parameters(name = "values: {0}; expected: {1}")
	public static Collection<Object[]> getConstructorArguments() {
		return ComprehensiveTestCases.createArrayMeanTestCases();
	}
}
