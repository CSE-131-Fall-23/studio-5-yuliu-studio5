package studio5;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import studio5.tests.ArrayMeanTestSuite;
import studio5.tests.ArraySumTestSuite;
import studio5.tests.DistanceBetweenTest;
import studio5.tests.FilledArraySumAndMeanComprehensiveTest;
import studio5.tests.FilledArrayTestSuite;
import studio5.tests.SubstituteAllTestSuite;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({ DistanceBetweenTest.class, SubstituteAllTestSuite.class, ArraySumTestSuite.class,
		FilledArrayTestSuite.class, ArrayMeanTestSuite.class, FilledArraySumAndMeanComprehensiveTest.class })
public class MethodsTestSuite {

}
