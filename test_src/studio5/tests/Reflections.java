package studio5.tests;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import studio5.Methods;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
class Reflections {
	static double invokeArrayMean(int[] values) throws NoSuchMethodException, SecurityException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {
		Method method = Methods.class.getMethod("arrayMean", int[].class);
		return (Double) method.invoke(null, values);
	}
}
