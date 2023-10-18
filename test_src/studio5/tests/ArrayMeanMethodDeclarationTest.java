package studio5.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import org.junit.Test;

import studio5.Methods;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class ArrayMeanMethodDeclarationTest {
	@Test
	public void testMethod() throws ClassNotFoundException, NoSuchMethodException, SecurityException {
		Method method = Methods.class.getMethod("arrayMean", int[].class);
		assertTrue(Modifier.isPublic(method.getModifiers()));
		assertTrue(Modifier.isStatic(method.getModifiers()));
		assertEquals(Double.TYPE, method.getReturnType());
	}
}
