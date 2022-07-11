package com.bridgelabz.junitprograms;

/**
 * Calculate Monthly Payment.
 * 
 * @author Shivaji Ghasti
 *
 */
public class MonthlyPayment {
	public static double generateMonthlyPayment(double principal, int years, double rate) {

		double n = 12 * years;
		double r = rate / 12 / 100;
		double monthlyPayment = (principal * r) / (1 - Math.pow(1 + r, -n));
		return monthlyPayment;
	}
	
	public static void main(String[] args) {
			
		double principal = Integer.parseInt(args[0]);
		int years = Integer.parseInt(args[1]);
		double rate = Integer.parseInt(args[2]);
		
		double payment = generateMonthlyPayment(principal, years, rate);
		System.out.println("The monthly Payment is: "+payment);
	}
}
