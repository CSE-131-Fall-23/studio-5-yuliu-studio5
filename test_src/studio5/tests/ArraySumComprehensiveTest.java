package studio5.tests;

import static org.junit.Assert.assertEquals;

import java.util.Collection;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import studio5.Methods;
import support.cse131.PrimitiveArrays;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
@RunWith(Parameterized.class)
public class ArraySumComprehensiveTest {
	private final int[] values;
	private final int expected;

	public ArraySumComprehensiveTest(List<Integer> values, int expected) {
		this.values = PrimitiveArrays.toIntArray(values);
		this.expected = expected;
	}

	@Test
	public void test() throws Exception {
		int actual = Methods.arraySum(values);
		assertEquals(expected, actual);
	}

	@Parameterized.Parameters(name = "values: {0}; expected: {1}")
	public static Collection<Object[]> getConstructorArguments() {
		return ComprehensiveTestCases.createArraySumTestCases();
	}
}
