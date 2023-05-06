/*
 * Student Name: Fei Lan
 * Lab professor: Leanne Seaward
 * Due Date: Mar 31, 2023
 * Modified: Mar 31, 2023
 * Description: This is the solution for Lab 6.
 */

package programmer;


/**
 * CommissionProgrammer class extends Programmer, to override
 * the toString() and getPaymentAmount() method.
 * 
 * @author Lanfei
 *
 */
public class CommissionProgrammer extends Programmer {
	/**
	 * gross weekly sales
	 */
	private double grossSales; 
	/**
	 * commission percentage
	 */
	private double commissionRate; 

	/**
	 * The constructor for the commission programmer object.
	 * 
	 * @param firstName the first name of the commission programmer
	 * @param lastName  the last name of the commission programmer
	 * @param socialSecurityNumber of the commission programmer
	 * @param month the month of the commission programmer
	 * @param year  the year of the commission programmer
	 * @param grossSales the gross sales of the commission programmer
	 * @param commissionRate the commission rate of the commission programmer
	 * 
	 */
	public CommissionProgrammer(String firstName, String lastName, String socialSecurityNumber, int month, int year,
			double grossSales, double commissionRate) {
		super(firstName, lastName, socialSecurityNumber, month, year);

		if (commissionRate <= 0.0 || commissionRate >= 1.0) { 
			throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
		}

		if (grossSales < 0.0) { 
			throw new IllegalArgumentException("Gross sales must be >= 0.0");
		}

		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	}

	/**
	 * set gross sales amount for the commission programmer
	 * 
	 * @param grossSales the gross sales of the commission programmer
	 */
	public void setGrossSales(double grossSales) {
		if (grossSales < 0.0) {
			throw new IllegalArgumentException("Gross sales must be >= 0.0");
		}

		this.grossSales = grossSales;
	}

	/**
	 * Return the gross sales of the commission programmer
	 * 
	 * @return the gross sales of the commission programmer
	 */
	public double getGrossSales() {
		return grossSales;
	}

	/**
	 * Set the commission rate of the commission programmer
	 * 
	 * @param commissionRate the commission rate of the commission programmer
	 */
	public void setCommissionRate(double commissionRate) {
		if (commissionRate <= 0.0 || commissionRate >= 1.0) { // validate
			throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
		}

		this.commissionRate = commissionRate;
	}

	/**
	 * Return the commission rate of the commission programmer
	 * 
	 * @return the commission rate of the commission programmer
	 */
	public double getCommissionRate() {
		return commissionRate;
	}

	/**
	 * Calculate the payment amount for the commission programmer
	 * 
	 * @return the payment amount for the commission programmer
	 */
	@Override
	public double getPaymentAmount() {
		return getCommissionRate() * getGrossSales();
	}


	/**
	 * Return String representation of CommissionProgrammer object
	 * 
	 * @return String representation of CommissionProgrammer object
	 */
	@Override
	public String toString() {
		return String.format("%s: %s\n%s: $%,.2f; %s: %s", "commission Programmer", 
				super.toString(), "gross sales", getGrossSales(), 
				"commission rate", getCommissionRate());
	}

}
