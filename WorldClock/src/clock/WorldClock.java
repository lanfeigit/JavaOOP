/*
 * Student Name: Fei Lan
 * Lab professor: Leanne Seaward
 * Due Date: Mar 24, 2023
 * Modified: Mar 24, 2023
 * Description: This class is a subclass WorldClock inheriting from the clock, 
 * whose constructor accepts a time offset.
 */
package clock;

import java.time.Instant;


/**
 * This class inheriting from Clock, whose constructor accepts a time offset.
 * For example, if you live in Ottawa, a new WorldClock(-4) should show the time
 * in Ottawa, four time zones after Universal Time Clock UTC. WorldClock(1)
 * shows time in a time zone 1 hour ahead of UTC.
 * 
 * @author Lanfei
 *
 */
public class WorldClock extends Clock {

	// the offset hours different from the UTC time zone.
	private int offset;

	public WorldClock(int offset) {
		this.offset = offset;
	}

	/**
	 * This is a getter which returns the offset hours from the UTC time
	 * 
	 * @return the offset hours from the UTC time
	 */
	public int getOffset() {
		return offset;
	}

	/**
	 * This is a setter for offset hours of the world clock
	 * 
	 * @param offset the offset hours of the world clock
	 */
	public void setOffset(int offset) {
		this.offset = offset;
	}

	/**
	 * This method returns the time for the work clock which is calculated by the
	 * offset hours from UTC time. For example, if you live in Ottawa, a new
	 * WorldClock(-4) should show the time in Ottawa, four time zones after
	 * Universal Time Clock UTC. WorldClock(1) shows time in a time zone 1 hour
	 * ahead of UTC.
	 * 
	 * @return the time for the world clock
	 */
	@Override
	public String getTime() {

		// get the string for UTC time
		String utc = Instant.now().toString();

		// the UTC time format is: 2023-03-15T03:23:05.075841100Z
		int utcHours = Integer.valueOf(utc.substring(11, 13));

		// calculate the hours between 0 and 23
		int worldHours = (utcHours + offset) % 24;

		// ensure the hours is not negative
		if (worldHours < 0) {
			worldHours += 24;
		}

		return String.format("%02d:%02d", worldHours, getMinutes());
	}

}
