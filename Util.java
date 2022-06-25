package Utility;

import java.util.Scanner;

public class Util {
		public static Scanner scanner = new Scanner(System.in);
	
		/*
		 * Method to reverse the number
		 */
		public static void reveseNo(int num) {
				// String Reversed ;
				int reversed = 0;
				while (num != 0) {
					int digit = num % 10; // get last digit from number
					reversed = reversed * 10 + digit;
					num /= 10; // remove the last digit from number
				}
				System.out.println("Reversed no  : " + reversed);
		}
	
		/*
		 * Input is user entered number. Perfect number is no that equal to sum of
		 * factors of that no
		 */
		public static void perfectNo(int number) {
				int sum = 0;
		
				for (int i = 1; i < number; i++) {
					if (number % i == 0) {
						sum = sum + i;
					}
				}
		
				if (sum == number) {
					System.out.println(number + " " + "is a Perfect Number");
				} else {
					System.out.println(number + " " + "is NOT a Perfect Number");
				}
		}
	
		/*
		 * fibonacci series where number is sum of last number of series.
		 */
		public static void fibonachi(int num1, int num2, int limit) {
				System.out.print("Fibonacci number series : ");
				System.out.print(" " + num1 + " " + num2);
		
				int sum = 0;
				for (int i = 2; i < limit; i++) {
					sum = num1 + num2;
					System.out.print(" " + sum);
					num1 = num2;
					num2 = sum;
				}
		}
	
		/*
		 * Number which is divisible by 1 and that number itself is prime no.
		 */
		public static void primeNo(int num) {
				int flag = 0;
				if (num == 0 || num == 1) {
					System.out.println(num + " is not prime number");
				} else {
					for (int i = 2; i <= num / 2; i++) {
						if (num % i == 0) {
							System.out.println(num + " is not prime number");
							flag = 1;
							break;
						}
					}
					if (flag == 0) {
						System.out.println(num + " is prime number");
					}
				}
		}
	
		/*
		 * Using System.currentTimeMilli taking start time and stop time and calculate
		 * elapsed time
		 */
		public static double stopwatch() {
				double startTime = System.currentTimeMillis();
		
				Scanner sc = new Scanner(System.in);
				sc.next();
		
				double stopTime = System.currentTimeMillis();
		
				double elapsedTime = stopTime - startTime;
		
				return elapsedTime;
		}
}
