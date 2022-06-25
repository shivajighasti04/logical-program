package com.bridgelabz.logicalsprogram;

import java.util.Scanner;

import Utility.Util;

/**
 * Java program to reverse number.
 * 
 * @author Shivaji Ghasti
 */
public class ReverseNumber {
		public static void main(String[] args) {
				System.out.print("Enter the no : ");
				Scanner sc = new Scanner(System.in);
				int num = sc.nextInt();
	
				Util.reveseNo(num);
		}
}
