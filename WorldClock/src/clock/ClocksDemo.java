/*
 * Student Name: Fei Lan
 * Lab professor: Leanne Seaward
 * Due Date: Mar 24, 2023
 * Modified: Mar 24, 2023
 * Description: This class will test Clock, WorldClock and AlarmClock classes
 */

package clock;

/**
 * This class is used to test Clock, WorldClock and AlarmClock classes. In this
 * class we create objects and stores all clocks in an array of Clock type, loop
 * through the array, use polymorphism to ask each clock for its time, and print
 * this time along with the clock class name
 */
public class ClocksDemo {

	/**
	 * This is the main method in which we will test Clock, WorldClock and
	 * AlarmClock classes.
	 */
	public static void main(String[] args) {

		Clock[] clocks = new Clock[5];

		clocks[0] = new Clock();
		clocks[1] = new WorldClock(-6);
		clocks[2] = new WorldClock(3);

		AlarmClock alarm1 = new AlarmClock();
		alarm1.setAlarmClock(7, 30);
		clocks[3] = alarm1;
		AlarmClock alarm2 = new AlarmClock();
		alarm2.setAlarmClock(23, 50);
		clocks[4] = alarm2;

		for (int i = 0; i < clocks.length; i++) {
			// get the class name
			System.out.print(clocks[i].getClass().getSimpleName() + ": ");

			System.out.println(clocks[i].getTime());
		}
	}

}
