package com.bridgelabz.logicalsprogram;

import java.util.Scanner;

import Utility.Util;

/**
 * Java Program to write fibonacci series until given range
 * 
 * @author Shivaji Ghasti
 *
 */
public class FibonacciSeries {
		public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the First number : ");
				int num1 = sc.nextInt();
				System.out.println("Enter the First number : ");
				int num2 = sc.nextInt();
				System.out.println("Enter how many no series you want : ");
				int limit = sc.nextInt();
	
				Util.fibonachi(num1, num2, limit);
		}
}
