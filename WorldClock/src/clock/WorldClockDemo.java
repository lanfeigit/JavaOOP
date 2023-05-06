/*
 * Student Name: Fei Lan
 * Lab professor: Leanne Seaward
 * Due Date: Mar 24, 2023
 * Modified: Mar 24, 2023
 * Description: This class will tests the WorldClock class
 */

package clock;

/**
 * Tests the Clock and WorldClock Classes.
 */
public class WorldClockDemo
{
   public static void main(String[] args)
   {
      //test WorldClock
      System.out.println("");
      System.out.println("Testing WorldClock class");
      int offset = 3;
      System.out.println("Offset: " + offset);
      WorldClock wclock = new WorldClock(offset);
      System.out.println("Hours: " + wclock.getHours());
      System.out.println("Minutes: " + wclock.getMinutes());
      System.out.println("Time: " + wclock.getTime());
   }
}
