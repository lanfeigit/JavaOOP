/*
 * Student Name: Fei Lan
 * Lab professor: Leanne Seaward
 * Due Date: March 10, 2023
 * Modified: Feb 28, 2023
 * Description: This class tests the Patient class with prompt inputs and displays the
 * health data of the patient object. 
*/

package healthdata;

import java.util.Scanner;

/**
 * This class is used to test the Patient class.
 * 
 * @author feilan
 *
 */
public class MyHealthDataTest {

	/**
	 * This is the main method to test creating a Patient object. This code prompts
	 * for input of the patient’s data, instantiate an object of the class Patient
	 * for that patient and then prints the data from patient object.
	 * 
	 * @param args optional command line parameters (not used)
	 */
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		/**
		 * Declare local variables for the attributes of the patient
		 */
		String firstName;
		String lastName;
		String gender;
		int birthYear;
		int birthMonth;
		int birthDay;
		double height;
		double weight;

		/**
		 * Prompt and input all attributes of the patient from the keyboard
		 */
		System.out.print("Enter firstname: ");
		firstName = keyboard.nextLine();
		System.out.print("Enter lastname: ");
		lastName = keyboard.nextLine();
		System.out.print("Enter gender: ");
		gender = keyboard.nextLine();

		System.out.print("Enter birth year: ");
		birthYear = keyboard.nextInt();
		keyboard.nextLine();
		System.out.print("Enter birth month: ");
		birthMonth = keyboard.nextInt();
		keyboard.nextLine();
		System.out.print("Enter birth day: ");
		birthDay = keyboard.nextInt();
		keyboard.nextLine();

		System.out.print("Enter height by inch: ");
		height = keyboard.nextDouble();
		keyboard.nextLine();

		System.out.print("Enter weight by pound: ");
		weight = keyboard.nextDouble();
		keyboard.nextLine();

		/**
		 * Create a Patient object by the constructor with all arguments
		 */
		Patient patient = new Patient(firstName, lastName, gender, birthYear, birthMonth, birthDay, height, weight);

		/**
		 * Display all health data for the patient
		 */
		patient.displayMyHealthData();

		keyboard.close();
	}
}
