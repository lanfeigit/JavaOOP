/*
 * Student Name: Fei Lan
 * Lab professor: Leanne Seaward
 * Due Date: Mar 31, 2023
 * Modified: Mar 31, 2023
 * Description: This is the solution for Lab 6.
 */
package programmer;

/**
 * 
 * This is the test for your interface Payme.
 * 
 * @author Lanfei
 *
 */
public class PaymeInterfaceTest {

	public static void main(String[] args) {

		Payme[] paymeObjects = new Payme[6];

		paymeObjects[0] = new Invoice("22776", "brakes", 3, 300.0);
		paymeObjects[1] = new Invoice("33442", "gear", 5, 90.99);
		paymeObjects[2] = new SalariedProgrammer("Chioma", "Chidmmia", "345-67-0001", 10, 2022, 320.0);
		paymeObjects[3] = new HourlyProgrammer("Amara", "Chukwu", "234-56-7770", 10, 2022, 18.95, 40.0);
		paymeObjects[4] = new CommissionProgrammer("Peter", "Goodman", "123-45-6999", 10, 2022, 16500.0, 0.44);
		paymeObjects[5] = new BasePlusCommissionProgrammer("Esther", "Patel", "102-34-5888", 10, 2022, 1200.0, 0.04,
				720.0);

		System.out.println("Payment for Invoices and Programmers are processed polymorphically:\n");

		try {
			// generically process each element in array paymeObjects
			for (Payme currentPayme : paymeObjects) {
				// output currentPayme and its appropriate payment amount
				System.out.printf("%s \n", currentPayme.toString());

				if (currentPayme instanceof BasePlusCommissionProgrammer) {
					// downcast Payme reference to
					// BasePlusCommissioProgrammer reference
					BasePlusCommissionProgrammer programmer = (BasePlusCommissionProgrammer) currentPayme;

					double oldBaseSalary = programmer.getBaseSalary();
					programmer.setBaseSalary(1.10 * oldBaseSalary);
					System.out.printf("new base salary with 10%% increase is: $%,.2f\n", programmer.getBaseSalary());
				}

				System.out.printf("%s: $%,.2f\n\n", "payment due", currentPayme.getPaymentAmount());
			}
		} catch (IllegalArgumentException ex) {
			System.out.printf("Error occured with bad argument: ");
			ex.printStackTrace();
		}

		try {

			Programmer programmer = (Programmer) paymeObjects[3];
			programmer.isJavaFun(false);

		} catch (IllegalArgumentException ex) {
			System.out.println(ex.getMessage());
		}
	}
}
