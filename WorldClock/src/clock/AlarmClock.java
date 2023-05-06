/*
 * Student Name: Fei Lan
 * Lab professor: Leanne Seaward
 * Due Date: Mar 24, 2023
 * Modified: Mar 24, 2023
 * Description: This class defines an alarm clock which has attributes 
 * for hours and minutes.
 */

package clock;

import java.time.LocalTime;

/**
 * This class is used to set the alarm hours and minutes, get the alarm time and
 * clear the alarm when the alarm time has been reached or exceeded.
 * 
 * @author Lanfei
 */
public class AlarmClock extends Clock {
	private int alarmHours = 0;
	private int alarmMinutes = 0;

	// use a flag to turn on and off the alarm
	private boolean alarmOn = false;

	/**
	 * This method is to set the alarm hours and minutes. 
	 * 
	 * @param hours   the hours of the alarm
	 * @param minutes the minutes of the alarm
	 */
	public void setAlarmClock(int hours, int minutes) {
		alarmHours = hours;
		alarmMinutes = minutes;
		alarmOn = true;
	}

	/**
	 * When the alarm time has been reached or exceeded return the time followed by
	 * the string "Alarm" and clear the alarm.
	 * 
	 * @return the time for the alarm clock
	 */
	@Override
	public String getTime() {

		// create an object for the alarm time
		LocalTime alarmTime = LocalTime.of(alarmHours, alarmMinutes);
		
		// create an object for the current clock time
		LocalTime currentTime = LocalTime.of(getHours(), getMinutes());

		String alarmTimeString = super.getTime() + " Alarm" + String.format("(%02d:%02d)", alarmHours, alarmMinutes);

		if (alarmOn) {
			// clear the alarm if the current time is the same or after the alarm time
			if (currentTime.equals(alarmTime) || currentTime.isAfter(alarmTime)) {

				// clear the alarm
				alarmHours = 0;
				alarmMinutes = 0;
				alarmOn = false;

				alarmTimeString = alarmTimeString + ": off";
			} else {
				alarmTimeString = alarmTimeString + ": on";
			}
		} else {
			alarmTimeString = alarmTimeString + ": not set";
		}

		return alarmTimeString;
	}

}
