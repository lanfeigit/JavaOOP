/*
 * Student Name: Fei Lan
 * Lab Professor: Professor Shavit Lupo
 * Due Date: Nov 25, 2022
 * Description: Assignment 02 (22F) Main Program
 */

/*
 * This class is used to test class CircularSawBlade by using utility classes
 * User and CircularSawBladeVerifier.
 */
public class Assignment02 {

	/*
	 * The main method loops circular saw blade objects when user inputs yes to 
	 * continue. For each blade object, input and set diameter and kerf, check 
	 * its diameter's tolerance and kerf's tolerance, count the number of blades 
	 * entered, number of diameters out of tolerance and number of
	 * kerfs out of tolerance, and finally output the results.
	 */
	public static void main(String[] args) {
		CircularSawBlade blade = new CircularSawBlade();
				
		int countBlades = 0; 
		int countDiametersOutOfTolerence = 0;
		int countKerfOutOfTolerence = 0;
		String nextLoop = "YES"; // input yes or no to continue for next blade
		double diameter;
		double kerf;
		String promptMessage;
		
		// continue the loop if input YES ignoring the case
		while (nextLoop.equalsIgnoreCase("YES")) {
			// input and set the diameter for the blade
			promptMessage = "Enter measured diameter: ";
			diameter = User.inputPositiveDouble(promptMessage);
			blade.setDiameter(diameter);
			
			// input and set the kerf for the blade
			promptMessage = "Enter measured kerf: ";
			kerf = User.inputPositiveDouble(promptMessage);
			blade.setKerf(kerf);
			
			// output the report for the blade
			System.out.println(blade.toString());
		
			// count the blades entered
			countBlades++;
			
			// check if the diameter is in tolerance 
			if (CircularSawBladeVerifier.isDiameterInTolerance(blade)) {
				System.out.println("Diameter in tolerance.");
			} else {
				System.out.println("Diameter out of tolerance.");
				countDiametersOutOfTolerence++;
			}
			
			// check if the kerf is in tolerance
			if (CircularSawBladeVerifier.isKerfInTolerance(blade)) {
				System.out.println("Kerf in tolerance.");
			} else {
				System.out.println("Kerf out of tolerance.");	
				countKerfOutOfTolerence++;
			}

			// output the results
			System.out.println("Blades Entered: " + countBlades);
			System.out.println("Diameter(s) out of tolerance: " + countDiametersOutOfTolerence);
			System.out.println("Kerf(s) out of tolerance: " + countKerfOutOfTolerence);
			
			System.out.println("Program by Fei Lan");
			
			// continue next loop if input YES
			promptMessage = "Continue (yes/no)? ";
			nextLoop = User.inputString(promptMessage);	
		}

	}
}

/*
 * References:
 * [1] C. Baylor. What Does the Term "Kerf" Mean in Woodworking?. thesprucecrafts.com.
 * https://www.thesprucecrafts.com/definition-of-kerf-3536563 (Accessed Oct 28, 2022).
 */