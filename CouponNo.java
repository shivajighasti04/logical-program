package com.bridgelabz.logicalsprogram;

/**
 * Java Program to distinct coupon number.
 * 
 * @author Shivaji Ghasti
 *
 */
public class CouponNo {
		public static void main(String[] args) {
				// Creating character array to create coupon
				char[] chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890".toCharArray();
				int max = 100000000;
				int random = (int) (Math.random() * max);
				// to store coupon no until random became 0
				StringBuffer couponNo = new StringBuffer();
	
				while (random > 0) {
					couponNo.append(chars[random % chars.length]);
					random /= chars.length;
				}
				System.out.println("Your Coupon No: " + couponNo);
		}
}
