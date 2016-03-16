/*
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * Find the sum of all the primes below two million.
*/

import java.lang.Math;

// COMMENT 1: File name in java should the class name in Java
public class SumOfPrimes {
	
	public static void main(String[] args) {
		int m = 0, flag = 0, sum = 0;

		for (int j = 2; j <= 10; j++) { // int n = 17;
			m = j / 2;
			for (int i = 2; i <= m; i++) {
				if (j % i == 0) {
					System.out.println("Number not prime");
					flag = 1;
					break;

				}
			}

			if (flag == 0) {
				System.out.println("Number is prime");
				sum = sum + j;
			}

			System.out.println("Sum of Primes" + sum);

		}
	}
}
