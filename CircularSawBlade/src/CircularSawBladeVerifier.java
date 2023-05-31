//ToDo: Supervisor wants programmer comments (use /* */ comment)

//ToDo: Supervisor wants programmer comments (use /* */ comment)
public class CircularSawBladeVerifier {
	
	// constant for the tolerance
	public static final double EPSILON = 0.015625; // one-64th of an inch 1/64
			
	/*
	 * This is a utility class with only static members, prevent
	 * Instantiation.
	 */
	private CircularSawBladeVerifier() {}
	
	/*
	 * This method is used to check if the circular saw blade diameter is within 
	 * tolerance (i.e. difference of actual and expected is less than or equal 
	 * to EPSILON). Return true if the actual diameter is within tolerance.
	 */
	public static boolean isDiameterInTolerance(CircularSawBlade blade) {
		double tolerence;

		tolerence = Math.abs(blade.getDiameter() - CircularSawBlade.EXPECTED_DIAMETER);
		
		if (tolerence <= EPSILON) {
			return true;
		} else {
			return false;
		}
	}
	
	/*
	 * This method is used to check if the circular saw blade kerf is within 
	 * tolerance (i.e. difference of actual and expected is less than or equal 
	 * to EPSILON). Return true if the actual kerf is within tolerance.
	 */
	public static boolean isKerfInTolerance(CircularSawBlade blade) {
		double tolerence;

		tolerence = Math.abs(blade.getKerf() - CircularSawBlade.EXPECTED_KERF);
		
		if (tolerence <= EPSILON) {
			return true;
		} else {
			return false;
		}
	}
}

/*
 * References:
 * [1] C. Baylor. What Does the Term "Kerf" Mean in Woodworking?. thesprucecrafts.com.
 * https://www.thesprucecrafts.com/definition-of-kerf-3536563 (Accessed Oct 28, 2022).
 */
