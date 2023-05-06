/*
 * Student Name: Fei Lan
 * Lab professor: Leanne Seaward
 * Due Date: Mar 31, 2023
 * Modified: Mar 31, 2023
 * Description: This is the solution for Lab 6.
 */

package programmer;

/**
 * HourlyProgrammer class extends Programmer, to override
 * the toString() and getPaymentAmount() method.
 * 
 * @author Lanfei
 *
 */
public class HourlyProgrammer extends Programmer {
	/**
	 * the wage of the HourlyProgrammer
	 */
	private double wage; 
	/**
	 * the hours of the HourlyProgrammer
	 */
	private double hours; 


	/**
	 * The constructor with all required seven parameters. 
	 * 
	 * @param firstName the first name of the hourly programmer
	 * @param lastName the last name of the hourly programmer
	 * @param socialSecurityNumber the SSN of the hourly programmer
	 * @param month the month of the hourly programmer
	 * @param year the year of the hourly programmer
	 * @param wage the wage of the hourly programmer
	 * @param hours the worked hours of the hourly programmer
	 */
	public HourlyProgrammer(String firstName, String lastName, String socialSecurityNumber, int month, int year,
			double wage, double hours) {
		super(firstName, lastName, socialSecurityNumber, month, year);

		if (wage < 0.0) { // validate wage
			throw new IllegalArgumentException("Hourly wage must be >= 0.0");
		}

		if ((hours < 0.0) || (hours > 168.0)) { // validate hours
			throw new IllegalArgumentException("Hours worked must be >= 0.0 and <= 168.0");
		}

		this.wage = wage;
		this.hours = hours;
	}


	/**
	 * Set the wage of the hourly programmer
	 * 
	 * @param wage the wage of the hourly programmer
	 */
	public void setWage(double wage) {
		if (wage < 0.0) { // validate wage
			throw new IllegalArgumentException("Hourly wage must be >= 0.0");
		}

		this.wage = wage;
	}


	/**
	 * Return the wage of the hourly programmer
	 * 
	 * @return the wage of the hourly programmer
	 */
	public double getWage() {
		return wage;
	}


	/**
	 * Set  the worked hours of the hourly programmer 
	 * 
	 * @param hours the worked hours of the hourly programmer 
	 */
	public void setHours(double hours) {
		if ((hours < 0.0) || (hours > 168.0)) { // validate hours
			throw new IllegalArgumentException("Hours worked must be >= 0.0 and <= 168.0");
		}

		this.hours = hours;
	}


	/**
	 * Return the hours worked for hourly programmer
	 * 
	 * @return the hours worked for hourly programmer
	 */
	public double getHours() {
		return hours;
	}


	/**
	 * Calculate the payment amount with wage and hours for the hourly programmer. 
	 * 
	 * @return the payment amount of the HourlyProgrammer object
	 */
	@Override
	public double getPaymentAmount() {
		if (getHours() <= 40) { // no overtime
			return getWage() * getHours();
		} else {
			return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
		}
	}

	
	/**
	 * Return String representation of HourlyProgrammer object  
	 * 
	 * @return String representation of HourlyProgrammer object  
	 */
	@Override
	public String toString() {
		return String.format("%s: %s\n%s: $%,.2f;%s: %.2f", "hourly Programmer", 
				super.toString(), "hourly wage", getWage(), "hours workd", getHours());
	}

}
