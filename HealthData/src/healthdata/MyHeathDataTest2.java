/*
 * Student Name: Fei Lan
 * Lab professor: Leanne Seaward
 * Due Date: March 10, 2023
 * Modified: Feb 28, 2023
 * Description: This is a Junit test suite to test getBMI() method in Patient class.  
*/

package healthdata;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

/**
 * This is a Junit test class for testing Patient.getBMI() method. There are two
 * test cases respectively for a successful test and a failure test against
 * getBMI() method. An error is introduced in getBIMError() method to test the
 * failure result.
 * 
 * @author feilan
 *
 */
public class MyHeathDataTest2 {
	private static final double EPSILON = 1E-4;

	/**
	 * Test getBMI() successfully with the correct inputs for height and weight.
	 */
	@Test
	public void testGetBMI() {
		Patient aPatient = new Patient("Mark", "Smith", "Male", 1990, 12, 3, 66.0, 150.0);

		double bmiResult = aPatient.getBMI();
		double expected = 24.208;
		Assert.assertEquals("message:", expected, bmiResult, EPSILON);
		assertTrue(true);
	}

	/**
	 * This test will fail because getBMIError() method has a bug.
	 */
	@Test
	public void testGetBMIError() {
		Patient aPatient = new Patient("Mark", "Smith", "Male", 1990, 12, 3, 66.0, 150.0);

		double bmiResult = aPatient.getBMIError();
		double expected = 24.208;
		Assert.assertEquals("message:", expected, bmiResult, EPSILON);
		assertTrue(true);
	}
}
