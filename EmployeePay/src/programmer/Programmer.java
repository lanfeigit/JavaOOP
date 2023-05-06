/*
 * Student Name: Fei Lan
 * Lab professor: Leanne Seaward
 * Due Date: Mar 31, 2023
 * Modified: Mar 31, 2023
 * Description: This is the solution for Lab 6.
 */

package programmer;

/**
 * This is an abstract superclass that IMPLEMENTS the Payme interface.
 * 
 * @author Lanfei
 *
 */
abstract public class Programmer implements Payme {
    /**
     * the firstName of programmer
     */
	private String firstName;
	/**
	 * the lastName of programmer
	 */
	private String lastName;
	/**
	 * the socialSecurityNumber of programmer
	 */
	private String socialSecurityNumber;
	/**
	 * the year of programmer
	 */
	private int year;
	/**
	 * the month of programmer
	 */
	private int month;

	/**
	 * The costructor with three arguments first name, last name and SSN.
	 * 
	 * @param first the first name of the programmer
	 * @param last  the last name of the programmer
	 * @param ssn   the SSN of the programmer
	 */
	public Programmer(String first, String last, String ssn) {
		firstName = first;
		lastName = last;
		socialSecurityNumber = ssn;
	}

	/**
	 * The constructor with five arguments: first name, last name, SSN, month and
	 * year.
	 * 
	 * @param first the first name of the programmer
	 * @param last  the last name of the programmer
	 * @param ssn   the SSN of the programmer
	 * @param month the month of the programmer
	 * @param year  the year of the programmer
	 */
	public Programmer(String first, String last, String ssn, int month, int year) {
		this(first, last, ssn);
		this.month = month;
		this.year = year;
	}

	/**
	 * Return a string for the representation of the programmer object
	 * 
	 * @return the string for the programmer object
	 */
	@Override
	public String toString() {
		return String.format("%s %s\n%s: %s", getFirstName(), getLastName(), "social security number",
				getSocialSecurityNumber());
	}

	/**
	 * Return the first name of the programmer
	 * 
	 * @return the firstName of the programmer
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Set the fist name of the programmer
	 * 
	 * @param firstName the firstName of the programmer
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Return the last name of the programmer
	 * 
	 * @return the lastName of the programmer
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Set the last name of the programmer
	 * 
	 * @param lastName the last name of programmer
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Return the social security number of the programmer
	 * 
	 * @return the social Security Number of the programmer
	 */
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	/**
	 * Set the social security number of the programmer
	 * 
	 * @param socialSecurityNumber the social Security Number of the programmer
	 */
	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}


	/**
	 * Throw exception if the parameter is false.
	 * 
	 * @param fun true or false 
	 */
	public void isJavaFun(boolean fun) {
		if (fun == true) {
			System.out.println("Java is fun");
		} else {
			throw new IllegalArgumentException("The choice is not good!");
		}
	}
}