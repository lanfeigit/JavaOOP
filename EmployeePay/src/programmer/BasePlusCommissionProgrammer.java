/*
 * Student Name: Fei Lan
 * Lab professor: Leanne Seaward
 * Due Date: Mar 31, 2023
 * Modified: Mar 31, 2023
 * Description: This is the solution for Lab 6.
 */

package programmer;

/**
 * BasePlusCommissionProgrammer class extends CommissionProgrammer, to override
 * the toString() and getPaymentAmount() method.
 * 
 * @author Lanfei
 *
 */
public class BasePlusCommissionProgrammer extends CommissionProgrammer {
    /**
     * this is baseSalary of the BasePlusCommissonProgrammer
     */
	private double baseSalary; 
	/**
	 * The constructor for the base plus commission programmer object.
	 * 
	 * @param firstName the first name of the base plus commission programmer
	 * @param lastName  the last name of the base plus commission programmer
	 * @param socialSecurityNumber  the SSN of the base plus commission programmer
	 * @param month the month of the base plus commission programmer
	 * @param year  the year of the base plus commission programmer
	 * @param grossSales the gross sales of the base plus commission programmer
	 * @param commissionRate the commission rate of the base plus commission programmer
	 * @param baseSalary the base salary of the base plus commission programmer
	 */
	public BasePlusCommissionProgrammer(String firstName, String lastName, String socialSecurityNumber, int month,
			int year, double grossSales, double commissionRate, double baseSalary) {
		super(firstName, lastName, socialSecurityNumber, month, year, grossSales, commissionRate);

		if (baseSalary < 0.0) { 
			throw new IllegalArgumentException("Base salary must be >= 0.0");
		}

		this.baseSalary = baseSalary;
	}

	/**
	 * Set the base salary of the base plus commission programmer
	 *  
	 * @param baseSalary the base salary of the base plus commission programmer
	 */
	public void setBaseSalary(double baseSalary) {
		if (baseSalary < 0.0) { 
			throw new IllegalArgumentException("Base salary must be >= 0.0");
		}

		this.baseSalary = baseSalary;
	}

	/**
	 * Return the base salary of the base plus commission programmer
	 * 
	 * @return the base salary of the base plus commission programmer
	 */
	public double getBaseSalary() {
		return baseSalary;
	}

	/**
	 * Calculate the payment amount for the base plus commission programmer
	 * 
	 * @return the base salary of the base plus commission programmer
	 */
	@Override
	public double getPaymentAmount() {
		return getBaseSalary() + super.getPaymentAmount();
	}

	/**
	 * return String representation of BasePlusCommissionProgrammer object
	 * 
	 * @return String representation of BasePlusCommissionProgrammer object
	 */
	@Override
	public String toString() {
		return String.format("%s: %s %s\n%s: %s\n%s: $%,.2f; %s: %s; %s: $%,.2f", "base-commission Programmer",
				getFirstName(), getLastName(), "social security number", getSocialSecurityNumber(), "gross sales",
				getGrossSales(), "commission rate", getCommissionRate(), "base salary", getBaseSalary());
	}
}
