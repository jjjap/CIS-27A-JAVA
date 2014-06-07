/**
 * @author Justin Jap
 */

package com.justinjap.c01.homework;

public class AvgSpeedInMPH {

	public static void main(String[] args) {
		// A runner runs 14km in 45min30sec [NOTE: 1mi = 1.6km]
		// Write a program that displays the average speed in mph.
		System.out.println("14km = (14/1.6) mi");
		System.out.println("45 min 30 sec = 45.5 min = (45.5/60) hr");
		System.out.println("Average Speed = (14/1.6)mi / (45.5/60)hr = " + ((14.0 / 1.60) / (45.5 / 60)) + " mph");		
	}
}
