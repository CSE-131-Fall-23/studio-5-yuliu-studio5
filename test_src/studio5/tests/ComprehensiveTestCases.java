package studio5.tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
class ComprehensiveTestCases {
	public static Collection<Object[]> createFilledArrayTestCases() {
		Collection<Object[]> args = new LinkedList<>();
		args.add(new Object[] { 42, 7 });
		args.add(new Object[] { 231, 425 });
		Random random = new Random();
		for (int i = 0; i < 23; ++i) {
			int length = 16 + random.nextInt(32);
			int value = -50 + random.nextInt(100);
			args.add(new Object[] { length, value });
		}
		return args;
	}

	public static Collection<Object[]> createArraySumTestCases() {
		Collection<Object[]> args = new LinkedList<>();
		args.add(new Object[] { Arrays.asList(1, 2, 3, 4), 10 });
		args.add(new Object[] { Arrays.asList(1, 2, 3, 4, -5), 5 });
		args.add(new Object[] { Arrays.asList(131), 131 });
		args.add(new Object[] { Arrays.asList(131, 231), 362 });
		args.add(new Object[] { Arrays.asList(131, 231, 425), 787 });
		Random random = new Random();
		for (int i = 0; i < 23; ++i) {
			int length = 4 + random.nextInt(8);
			int expected = 0;
			List<Integer> values = new ArrayList<>(length);
			for (int j = 0; j < length; ++j) {
				int value = -99 + random.nextInt(199);
				values.add(value);
				expected += value;
			}
			args.add(new Object[] { values, expected });
		}
		return args;
	}

	public static Collection<Object[]> createArrayMeanTestCases() {
		Collection<Object[]> args = createArraySumTestCases();
		for (Object[] array : args) {
			@SuppressWarnings("unchecked")
			List<Integer> values = (List<Integer>) array[0];
			int expectedSum = (Integer) array[1];
			array[1] = expectedSum / (double) values.size();
		}
		return args;
	}
}
