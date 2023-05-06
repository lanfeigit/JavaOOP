/*
 * Student Name: Fei Lan
 * Lab professor: Leanne Seaward
 * Due Date: Mar 24, 2023
 * Modified: Mar 24, 2023
 * Description: This class defines a clock object which has attributes 
 * for hours and minutes as well as a method to return the current time 
 */
package clock;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

/**
 * Part I: Implement a class Clock whose getHours, getMinutes and getTime
 * methods return the current time at your location. Return the time as a
 * string.
 * 
 * Here is how to retrieve the current time as a String: With Java 8, you can
 * use 3 classes in the java.time package: Instant, LocalDateTime and ZoneId.
 * Here's how you do it: String timeString =
 * LocalDateTime.ofInstant(Instant.now(), ZoneId.systemDefault()).toString()
 * 
 * you'll need to extract the hours and minutes as a substring.
 */
public class Clock {
	// Your work goes here

	private int hours;
	private int minutes;

	/**
	 * Build the clock object with current time at the local time zone
	 */
	public Clock() {
		String timeString = LocalDateTime.ofInstant(Instant.now(), ZoneId.systemDefault()).toString();

		// the timeString format is 2023-03-15T22:38:36.324813200
		hours = Integer.valueOf(timeString.substring(11, 13));
		minutes = Integer.valueOf(timeString.substring(14, 16));
	}

	/**
	 * This is a getter which returns the hours of the clock
	 * 
	 * @return the hours of the clock
	 */
	public int getHours() {
		return hours;
	}

	/**
	 * This is a setter for hours of the clock
	 * 
	 * @param hours the hours of the clock
	 */
	public void setHours(int hours) {
		this.hours = hours;
	}

	/**
	 * This is a getter which return the minutes of the clock
	 * 
	 * @return the minutes
	 */
	public int getMinutes() {
		return minutes;
	}

	/**
	 * This is a setter for minutes of the clock
	 * 
	 * @param minutes the minutes of the clock
	 */
	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

	/**
	 * this method use String method to extract the time and the the hour
	 * 
	 * @return a string for the representation of the clock object
	 */
	public String getTime() {
		return String.format("%02d:%02d", getHours(), getMinutes());
	}

}
