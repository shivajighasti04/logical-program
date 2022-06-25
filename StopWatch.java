package com.bridgelabz.logicalsprogram;

import java.util.Scanner;

import Utility.Util;

/**
 *  Write a Stopwatch Program for measuring the time that elapses between the
 * start and end clicks
 * 
 * @author Shivaji Ghasti
 *
 */
public class StopWatch {
		public static void main(String[] args) throws InterruptedException {
			System.out.println("Press 1 and enter to stop ");
			System.out.println("3");
			Thread.sleep(1000);
			System.out.println("2");
			Thread.sleep(1000);
			System.out.println("1");
			Thread.sleep(1000);

			System.out.println("Go !!!!!!!....");

			double elapsedTime = Util.stopwatch();

			System.out.println("Reaction time : " + elapsedTime + " ms");
			System.out.println("Reaction time : " + ( elapsedTime / 1000) % 60 + " sec");
		}
}	


