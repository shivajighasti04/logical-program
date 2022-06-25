package com.bridgelabz.logicalsprogram;

import java.util.Scanner;

import Utility.Util;

/**
 * Java program to find if number is perfect number or not
 * 
 * @author Shivaji Ghasti
 *
 */
public class PerfectNumber {
		public static void main(String[] args) {
				int i, Number, Sum = 0;
				Scanner sc = new Scanner(System.in);
				System.out.print("Enter the number: ");
				Number = sc.nextInt();
	
					Util.perfectNo(Number);
		}	
}
