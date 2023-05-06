/*
 * Student Name: Fei Lan
 * Lab professor: Leanne Seaward
 * Due Date: March 10, 2023
 * Modified: Feb 28, 2023
 * Description: This class defines a patient object which maintains important health 
 * information about a patient.
*/

package healthdata;

import java.time.LocalDate;
import java.time.Period;

/**
 * This class maintains important health information about a patient. Note: This
 * class assumes values passed to the set methods are correct.
 * 
 * @author feilan
 *
 */
public class Patient {


	/*
	 * The first name, last name, gender, birth year, birth month, birth day, height
	 * and weight of the patient object
	 */

	private String firstName;
	private String lastName;
	private String gender;
	private int birthYear;
	private int birthMonth;
	private int birthDay;
	private double height; // unit is inch
	private double weight; // unit is pound (lb)

	
	/**
	 * This is a parameterized constructor which takes first name, last name,
	 * gender, birth year, birth month, birth day, height and weight of the patient
	 * as parameters
	 * 
	 * @param firstName  the first name of the patient
	 * @param lastName   the last name of the patient
	 * @param gender     the gender of the patient
	 * @param birthYear  the birth year of the patient
	 * @param birthMonth the birth month of the patient
	 * @param birthDay   the birth day of the patient
	 * @param height     the height of the patient
	 * @param weight     the weight of the patient
	 */
	public Patient(String firstName, String lastName, String gender, int birthYear, int birthMonth, int birthDay,
			double height, double weight) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.birthYear = birthYear;
		this.birthMonth = birthMonth;
		this.birthDay = birthDay;
		this.height = height;
		this.weight = weight;
	}


	/**
	 * This is a getter which returns the first name of the patient.
	 * 
	 * @return the first name of the patient
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * This is a setter for first name of the patient.
	 * 
	 * @param firstName the first name of the patient
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * This is a getter which returns the last name of the patient.
	 * 
	 * @return the last name of the patient
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * This is a setter for last name of the patient.
	 * 
	 * @param lastName the last name of the patient
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * This is a getter which returns the gender of the patient.
	 * 
	 * @return the gender of the patient
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * This is a setter for gender of the patient.
	 * 
	 * @param gender the gender of the patient
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * This is a getter which returns the birth year of the patient.
	 * 
	 * @return the birth year of the patient
	 */
	public int getBirthYear() {
		return birthYear;
	}

	/**
	 * This is a setter for birth year of the patient.
	 * 
	 * @param birthYear the birth year of the patient
	 */
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	/**
	 * This is a getter which returns the birth month of the patient.
	 * 
	 * @return the birth month of the patient
	 */
	public int getBirthMonth() {
		return birthMonth;
	}

	/**
	 * This is a setter for birth month of the patient.
	 * 
	 * @param birthMonth the birth month of the patient
	 */
	public void setBirthMonth(int birthMonth) {
		this.birthMonth = birthMonth;
	}

	/**
	 * This is a getter which returns the birth day of the patient.
	 * 
	 * @return the birth day of the patient
	 */
	public int getBirthDay() {
		return birthDay;
	}

	/**
	 * This is a setter for birth day of the patient.
	 * 
	 * @param birthDay the birth day of the patient
	 */
	public void setBirthDay(int birthDay) {
		this.birthDay = birthDay;
	}

	/**
	 * This is a getter which returns the height of the patient.
	 * 
	 * @return the height of the patient
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * This is a setter for height of the patient. The unit of the height is inch.
	 * 
	 * @param height the height of the patient
	 */
	public void setHeight(double height) {
		this.height = height;
	}

	/**
	 * This is a getter which returns the weight of the patient.
	 * 
	 * @return the weight of the patient
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * This is a setter for weight of the patient. The unit of weight is pound (lb).
	 * 
	 * @param weight the weight of the patient
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}


	/**
	 * This method calculates and returns the patient Body Mass Index (BMI).
	 * 
	 * @return the patient Body Mass Index (BMI)
	 */
	public double getBMI() {
		return (getWeight() * 703) / (getHeight() * getHeight());
	}

	
	/**
	 * This method calculates and returns the patient Body Mass Index (BMI).
	 * Note: an error is introduced in this method which uses the wrong operator '+'
	 * for (getHeight() + getHeight()) that should be (getHeight() * getHeight()).
	 * 
	 * @return the patient Body Mass Index (BMI)
	 */
	public double getBMIError() {
		return (getWeight() * 703) / (getHeight() + getHeight());
	}

	/**
	 * This method calculates and returns the age in years for the patient.
	 * 
	 * @return the age of the patient
	 */
	public int getAge() {

		// date of today
		LocalDate today = LocalDate.now();

		// birth date
		LocalDate birthday = LocalDate.of(birthYear, birthMonth, birthDay);

		// calculate the period between today and birth date
		Period p = Period.between(birthday, today);

		return p.getYears();
	}

	/**
	 * MaximumHeartRate is calculated as: 220 – Age in years
	 * 
	 * @return the Maximum Heart Rate of the patient
	 */
	public int calculateMaximumHeartRate() {
		int maxHeartRate;
		maxHeartRate = 220 - getAge();
		return maxHeartRate;
	}

	/**
	 * Use an integer array to store the range for the Minimum Target Heart Rate and
	 * Maximum Target Heart Rate for the patient. In the array, the first element is
	 * the Minimum Target Heart Rate, and the second element is the Minimum Target
	 * Heart Rate.
	 * 
	 * @return the target heart rate range of the patient
	 */
	public int[] calculateTargetHeartRateRange() {
		int[] range = new int[2];

		/**
		 * MinimumTargetHeartRate is calculated as: 50% of Maximum Heart Rate
		 */
		range[0] = calculateMaximumHeartRate() / 2;

		/**
		 * MaximumTargetHeartRate is calculated as: 85% of Maximum Heart Rate
		 */
		range[1] = (int) Math.round(calculateMaximumHeartRate() * 0.85);

		return range;
	}

	/**
	 * Display the all health data of the patient using System.out.printf()
	 */
	public void displayMyHealthData() {

		System.out.println("The health data of the patient is displayed as below:");
		System.out.printf("First Name: %s%n", firstName);
		System.out.printf("Last Name: %s%n", lastName);
		System.out.printf("Gender: %s%n", gender);

		System.out.printf("Year of Birth: %d%n", birthYear);
		System.out.printf("Month of Birth: %d%n", birthMonth);
		System.out.printf("Day of Birth: %d%n", birthDay);

		System.out.printf("Height: %.1f in%n", height);
		System.out.printf("Weight: %.1f lb%n", weight);

		System.out.printf("Age: %d%n", getAge());

		double bmi = getBMI();
		// round BMI value to 1 decimal
		bmi = Math.round(bmi * 10.0) / 10.0;
		System.out.printf("BMI: %.1f%n", bmi);

		System.out.printf("Maximum Heart Rate: %s%n", calculateMaximumHeartRate());

		int[] targetHeartRateRange = calculateTargetHeartRateRange();

		System.out.printf("Target Heart Rate Range: %d - %d%n", targetHeartRateRange[0], targetHeartRateRange[1]);

		System.out.printf("BMI Value is: ");
		if (bmi < 18.5) {
			System.out.printf("Underweight");
		} else if ((bmi >= 18.5) && (bmi <= 24.9)) {
			System.out.printf("Normal");
		} else if ((bmi >= 25.0) && (bmi <= 29.9)) {
			System.out.printf("Overweight");
		} else {
			System.out.printf("Obese%n");
		}

		System.out.printf("%n%n");

		System.out.println("BMI VALUES");
		System.out.println("Underweight: less than 18.5");
		System.out.println("Normal:      between 18.5 and 24.9");
		System.out.println("Overweight:  between 25 and 29.9");
		System.out.println("Obese:       30 or greater");
	}

} // end class Patient
