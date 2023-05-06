/*
 * Student Name: Fei Lan
 * Lab professor: Leanne Seaward
 * Due Date: Mar 31, 2023
 * Modified: Mar 31, 2023
 * Description: This is the solution for Lab 6.
 */

package programmer;

/**
 * SalariedProgrammer concrete class extends abstract class Programmer, to
 * override toString() and getPaymentAmount() method.
 * 
 * @author Lanfei
 *
 */
public class SalariedProgrammer extends Programmer {
	private double weeklySalary;

	/**
	 * The constructor with all required six parameters. 
	 * 
	 * @param firstName the first name of the salaried programmer
	 * @param lastName the last name of the salaried programmer
	 * @param socialSecurityNumber the SSN of the salaried programmer
	 * @param month the month of the salaried programmer
	 * @param year the year of the salaried programmer
	 * @param weeklySalary the weekly salary of the salaried programmer
	 */
	public SalariedProgrammer(String firstName, String lastName, String socialSecurityNumber, int month, int year,
			double weeklySalary) {
		super(firstName, lastName, socialSecurityNumber, month, year);

		if (weeklySalary < 0.0) {
			throw new IllegalArgumentException("Weekly salary must be >= 0.0");
		}

		this.weeklySalary = weeklySalary;
	}

	/**
	 * Set the weekly salary of the salaried programmer
	 * 
	 * @param weeklySalary the weekly salary of the salaried programmer
	 */
	public void setWeeklySalary(double weeklySalary) {
		if (weeklySalary < 0.0) {
			throw new IllegalArgumentException("Weekly salary must be >= 0.0");
		}

		this.weeklySalary = weeklySalary;
	}

	/**
	 * Return the weekly salary of the salaried programmer
	 * 
	 * @return the weekly salary of the salaried programmer
	 */
	public double getWeeklySalary() {
		return weeklySalary;
	}

	/**
	 * Override the getPaymentAmount() method and return the payment amount
	 * 
	 * @return the payment amount of the salaried programmer
	 */
	@Override
	public double getPaymentAmount() {
		return getWeeklySalary();
	}

	/**
	 * Return String representation of SalariedProgrammer object
	 * 
	 * @return the string representation of SalariedProgrammer object
	 */
	@Override
	public String toString() {
		return String.format("%s: %s\n%s: $%,.2f", "salaried Programmer", super.toString(), "weekly salary",
				getWeeklySalary());
	}
}
